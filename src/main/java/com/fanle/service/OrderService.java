package com.fanle.service;

import com.fanle.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fanle.req.order.OrderQueryReq;
import com.fanle.req.order.OrderSaveReq;
import com.fanle.req.order.OrderUpdateReq;
import com.fanle.resp.order.OrderQueryResp;

import java.util.List;

/**
* @author mayao
* @description 针对表【order(;)】的数据库操作Service
* @createDate 2024-04-29 15:18:20
*/
public interface OrderService extends IService<Order> {

    List<OrderQueryResp> getByCondition(OrderQueryReq req);

    Integer insert(OrderSaveReq req);

    Integer updateOrderById(OrderUpdateReq req);

    Integer deleteOrderById(Integer id);
}
