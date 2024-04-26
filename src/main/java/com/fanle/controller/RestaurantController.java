package com.fanle.controller;

import com.fanle.entity.Restaurant;
import com.fanle.req.rest.RestaurantQueryReq;
import com.fanle.req.rest.RestaurantSaveReq;
import com.fanle.resp.RespBean;
import com.fanle.service.RestaurantService;
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
 * @Date: 2024/4/26 - 上午10:18
 * @author: mafanle
 */
@RequestMapping("/restaurant")
@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/getByCondition")
    public RespBean<List<Restaurant>> getRestaurants(@RequestBody RestaurantQueryReq req){
        return RespBean.ok(restaurantService.getRestaurants(req));
    }

    @PostMapping("/insert")
    public RespBean insertRestaurant(@RequestBody RestaurantSaveReq req){
        return RespBean.ok(restaurantService.insertRestaurant(req));
    }

    @PutMapping("/update")
    public RespBean updateRestaurantById(@RequestBody RestaurantSaveReq req){
        return RespBean.ok(restaurantService.updateRestaurantById(req));
    }

    @DeleteMapping("/delete/{id}")
    public RespBean deleteRestaurantById(@PathVariable("id") Integer id){
        return RespBean.ok(restaurantService.deleteRestaurantById(id));
    }
}
