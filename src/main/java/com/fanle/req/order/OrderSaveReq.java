package com.fanle.req.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

/**
 * @Date: 2024/4/29 - 下午3:48
 * @author: mafanle
 */
@Data
public class OrderSaveReq {
    /**
     * 订单编号
     */
    private Integer id;

    /**
     * 用户编号
     */
    @NotNull(message = "【userId】不能为空")
    private Integer userId;

    /**
     * 餐厅编号
     */
    @NotNull(message = "【restaurantId】不能为空")
    private Integer restaurantId;

    /**
     * 桌号
     */
    @NotNull(message = "【tableId】不能为空")
    private Integer tableId;

    /**
     * 菜品编号
     */
    @NotNull(message = "【dishId】不能为空")
    private Integer dishId;

    /**
     * 数量
     */
    @NotNull(message = "【quantity】不能为空")
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
