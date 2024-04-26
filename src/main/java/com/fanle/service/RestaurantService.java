package com.fanle.service;

import com.fanle.entity.Restaurant;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fanle.req.rest.RestaurantQueryReq;
import com.fanle.req.rest.RestaurantSaveReq;

import java.util.List;

/**
* @author mayao
* @description 针对表【restaurant(;)】的数据库操作Service
* @createDate 2024-04-25 13:52:40
*/
public interface RestaurantService extends IService<Restaurant> {

    List<Restaurant> getRestaurants(RestaurantQueryReq req);

    Integer insertRestaurant(RestaurantSaveReq req);

    Integer updateRestaurantById(RestaurantSaveReq req);

    Integer deleteRestaurantById(Integer id);
}
