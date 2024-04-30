package com.fanle.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.Dish;
import com.fanle.enums.BusinessExceptionEnum;
import com.fanle.exception.BusinessException;
import com.fanle.req.dish.DishQueryReq;
import com.fanle.req.dish.DishSaveReq;
import com.fanle.resp.dish.DishQueryResp;
import com.fanle.service.DishService;
import com.fanle.mapper.DishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author mayao
* @description 针对表【dish(;)】的数据库操作Service实现
* @createDate 2024-04-25 13:52:40
*/
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
    implements DishService{

    @Autowired
    private DishMapper dishMapper;

    @Override
    public DishQueryResp getDishes(DishQueryReq req) {
        Integer start = null;
        Integer pageNum = req.getPageNum();
        Integer pageSize = req.getPageSize();
        if (ObjectUtil.isNotNull(pageNum) && ObjectUtil.isNotNull(pageSize)){
            start = (pageNum - 1) * pageSize;
        }
        List<Dish> dishes = dishMapper.selectListByCondition(req, start, pageSize);
        int total = dishMapper.selectCountByCondition(req);
        DishQueryResp resp = new DishQueryResp();
        resp.setDishes(dishes);
        resp.setPageNum(pageNum);
        resp.setPageSize(pageSize);
        resp.setTotal(total);
        return resp;
    }

    @Override
    public int insertDish(DishSaveReq req) {
        // 查询该餐厅是否已经存在这个菜品
        Dish dishDB = dishMapper.selectOne(new LambdaQueryWrapper<Dish>()
                .eq(Dish::getRestaurantId, req.getRestaurantId())
                .eq(Dish::getName, req.getName()));
        if (ObjectUtil.isNotNull(dishDB)){
            throw new BusinessException(BusinessExceptionEnum.DISH_ALREADY_EXIST_IN_THIS_RESTAURANT);
        }
        Dish dish = BeanUtil.copyProperties(req, Dish.class);
        return dishMapper.insert(dish);
    }

    @Override
    public Integer updateDishById(DishSaveReq req) {
        Dish dish = BeanUtil.copyProperties(req, Dish.class);
        return dishMapper.updateById(dish);
    }

    @Override
    public Integer deleteDishById(Integer id) {
        return dishMapper.deleteById(id);
    }


}




