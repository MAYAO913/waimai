package com.fanle.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.Restaurant;
import com.fanle.enums.BusinessExceptionEnum;
import com.fanle.exception.BusinessException;
import com.fanle.req.rest.RestaurantQueryReq;
import com.fanle.req.rest.RestaurantSaveReq;
import com.fanle.resp.rest.RestaurantQueryResp;
import com.fanle.service.RestaurantService;
import com.fanle.mapper.RestaurantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author mayao
* @description 针对表【restaurant(;)】的数据库操作Service实现
* @createDate 2024-04-25 13:52:40
*/
@Service
public class RestaurantServiceImpl extends ServiceImpl<RestaurantMapper, Restaurant>
    implements RestaurantService{

    @Autowired
    private RestaurantMapper restaurantMapper;

    @Override
    public RestaurantQueryResp getRestaurants(RestaurantQueryReq req) {
        Integer start = null;
        Integer pageNum = req.getPageNum();
        Integer pageSize = req.getPageSize();
        if (ObjectUtil.isNotNull(pageNum) && ObjectUtil.isNotNull(pageSize)){
            start = (pageNum - 1) * pageSize;
        }
        List<Restaurant> restaurants = restaurantMapper.selectListByCondition(req, start, pageSize);
        int total = restaurantMapper.selectCountByCondition(req);
        RestaurantQueryResp resp = new RestaurantQueryResp();
        resp.setRestaurants(restaurants);
        resp.setPageNum(pageNum);
        resp.setPageSize(pageSize);
        resp.setTotal(total);
        return resp;
    }

    @Override
    public Integer insertRestaurant(RestaurantSaveReq req) {
        // 查看是否存在该餐厅
        Restaurant restaurantDB = restaurantMapper.selectOne(new LambdaQueryWrapper<Restaurant>()
                .eq(Restaurant::getName, req.getName()));
        if (ObjectUtil.isNotNull(restaurantDB)){
            throw new BusinessException(BusinessExceptionEnum.RESTAURANT_ALREADY_EXIST);
        }
        Restaurant restaurant = BeanUtil.copyProperties(req, Restaurant.class);
        return restaurantMapper.insert(restaurant);
    }

    @Override
    public Integer updateRestaurantById(RestaurantSaveReq req) {
        return restaurantMapper.updateById(BeanUtil.copyProperties(req, Restaurant.class));
    }

    @Override
    public Integer deleteRestaurantById(Integer id) {
        return restaurantMapper.deleteById(id);
    }
}




