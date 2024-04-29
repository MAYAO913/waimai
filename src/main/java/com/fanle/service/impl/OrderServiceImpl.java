package com.fanle.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.Order;
import com.fanle.req.order.OrderQueryReq;
import com.fanle.req.order.OrderSaveReq;
import com.fanle.resp.order.OrderQueryResp;
import com.fanle.service.OrderService;
import com.fanle.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* @author mayao
* @description 针对表【order(;)】的数据库操作Service实现
* @createDate 2024-04-29 15:18:20
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderQueryResp> getByCondition(OrderQueryReq req) {
        Integer start = null;
        Integer pageNum = req.getPageNum();
        Integer pageSize = req.getPageSize();
        if (ObjectUtil.isNotNull(pageNum) && ObjectUtil.isNotNull(pageSize)){
            start = (pageNum - 1) * pageSize;
        }

        return orderMapper.getByCondition(req, start, pageSize);
    }

    @Override
    public Integer insert(OrderSaveReq req) {
        Order order = BeanUtil.copyProperties(req, Order.class);
        order.setOrderTime(new Date());
        return orderMapper.insert(order);
    }

    @Override
    public Integer updateOrderById(OrderSaveReq req) {
        Order order = BeanUtil.copyProperties(req, Order.class);
        return orderMapper.updateById(order);
    }

    @Override
    public Integer deleteOrderById(Integer id) {
        return orderMapper.deleteById(id);
    }
}




