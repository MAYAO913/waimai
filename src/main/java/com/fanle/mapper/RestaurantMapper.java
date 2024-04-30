package com.fanle.mapper;

import com.fanle.entity.Restaurant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanle.req.rest.RestaurantQueryReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author mayao
* @description 针对表【restaurant(;)】的数据库操作Mapper
* @createDate 2024-04-25 13:52:40
* @Entity com.fanle.entity.Restaurant
*/
@Mapper
public interface RestaurantMapper extends BaseMapper<Restaurant> {

    List<Restaurant> selectListByCondition(@Param("req") RestaurantQueryReq req,
                                           @Param("start") Integer start,
                                           @Param("pageSize") Integer pageSize);

    int selectCountByCondition(RestaurantQueryReq req);
}




