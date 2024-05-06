package com.fanle.req.order;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

/**
 * @Date: 2024/4/29 - 下午3:48
 * @author: mafanle
 */
@Data
public class OrderUpdateReq {
    /**
     * 订单编号
     */
    @NotNull(message = "【id】不能为空")
    private Integer id;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 餐厅编号
     */
    private Integer restaurantId;

    /**
     * 桌号
     */
    private Integer tableId;

    /**
     * 菜品编号
     */
    private Integer dishId;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 该菜品的价格
     */
    private Double price;

    /**
     * 订单状态
     */
    private Boolean status;

    /**
     * 下单时间
     */
    private Date orderTime;
}
