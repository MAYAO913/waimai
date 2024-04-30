package com.fanle.mapper;

import com.fanle.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanle.req.dish.DishQueryReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author mayao
* @description 针对表【dish(;)】的数据库操作Mapper
* @createDate 2024-04-25 13:52:40
* @Entity com.fanle.entity.Dish
*/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

    List<Dish> selectListByCondition(@Param("req") DishQueryReq req,
                                     @Param("start") Integer start,
                                     @Param("pageSize") Integer pageSize);

    int selectCountByCondition(DishQueryReq req);
}




