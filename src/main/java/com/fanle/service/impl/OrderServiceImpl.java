package com.fanle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.Order;
import com.fanle.service.OrderService;
import com.fanle.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author mayao
* @description 针对表【order(;)】的数据库操作Service实现
* @createDate 2024-04-25 13:52:40
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




