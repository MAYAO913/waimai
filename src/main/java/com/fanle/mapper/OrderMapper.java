package com.fanle.mapper;

import com.fanle.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanle.req.order.OrderQueryReq;
import com.fanle.resp.order.OrderQueryResp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author mayao
* @description 针对表【order(;)】的数据库操作Mapper
* @createDate 2024-04-29 15:18:20
* @Entity com.fanle.entity.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    List<OrderQueryResp> getByCondition(@Param("req") OrderQueryReq req,
                                        @Param("start") Integer start,
                                        @Param("pageSize") Integer pageSize);

    List<OrderQueryResp> findOrdersByIds(@Param("req") OrderQueryReq req,
                                        @Param("start") Integer start,
                                        @Param("pageSize") Integer pageSize);
}




