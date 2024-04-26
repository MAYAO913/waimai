package com.fanle.service;

import com.fanle.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fanle.req.dish.DishQueryReq;
import com.fanle.req.dish.DishSaveReq;

import java.util.List;

/**
* @author mayao
* @description 针对表【dish(;)】的数据库操作Service
* @createDate 2024-04-25 13:52:40
*/
public interface DishService extends IService<Dish> {

    List<Dish> getDishes(DishQueryReq req);

    int insertDish(DishSaveReq req);

    Integer updateDishById(DishSaveReq req);

    Integer deleteDishById(Integer id);
}
