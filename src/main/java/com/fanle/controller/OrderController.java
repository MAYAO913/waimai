package com.fanle.controller;

import com.fanle.entity.Order;
import com.fanle.req.order.OrderQueryReq;
import com.fanle.req.order.OrderSaveReq;
import com.fanle.resp.RespBean;
import com.fanle.resp.order.OrderQueryResp;
import com.fanle.service.OrderService;
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
 * @Date: 2024/4/29 - 下午3:19
 * @author: mafanle
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 查询
    @PostMapping("/getByCondition")
    public RespBean<List<OrderQueryResp>> getByCondition(@RequestBody OrderQueryReq req){
        return RespBean.ok(orderService.getByCondition(req));
    }

    // 新增
    @PostMapping("/insert")
    public RespBean insert(@RequestBody OrderSaveReq req){
        return RespBean.ok(orderService.insert(req));
    }

    @PutMapping("/update")
    public RespBean updateOrderById(@RequestBody OrderSaveReq req){
        return RespBean.ok(orderService.updateOrderById(req));
    }

    @DeleteMapping("/delete/{id}")
    public RespBean deleteOrderById(@PathVariable("id") Integer id){
        return RespBean.ok(orderService.deleteOrderById(id));
    }
}
