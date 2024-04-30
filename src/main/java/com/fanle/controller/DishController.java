package com.fanle.controller;

import com.fanle.entity.Dish;
import com.fanle.req.dish.DishQueryReq;
import com.fanle.req.dish.DishSaveReq;
import com.fanle.resp.RespBean;
import com.fanle.resp.dish.DishQueryResp;
import com.fanle.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Date: 2024/4/25 - 下午7:28
 * @author: mafanle
 */
@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @PostMapping("/insert")
    public RespBean insertDish(@RequestBody DishSaveReq req){
        return RespBean.ok(dishService.insertDish(req));
    }

    @PostMapping("/getByCondition")
    public RespBean<DishQueryResp> getDishes(@RequestBody DishQueryReq req){
        return RespBean.ok(dishService.getDishes(req));
    }

    @PutMapping("/update")
    public RespBean updateDishById(@RequestBody DishSaveReq req){
        return RespBean.ok(dishService.updateDishById(req));
    }

    @DeleteMapping("/delete/{id}")
    public RespBean deleteDishById(@PathVariable("id") Integer id){
        return RespBean.ok(dishService.deleteDishById(id));
    }

}
