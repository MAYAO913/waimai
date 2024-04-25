package com.fanle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * ;
 * @TableName order_dish_detail
 */
@TableName(value ="order_dish_detail")
@Data
public class OrderDishDetail implements Serializable {
    /**
     * 订单详情编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 订单编号
     */
    private Integer orderId;

    /**
     * 菜品编号
     */
    private Integer dishId;

    /**
     * 菜品数量
     */
    private Integer quantity;

    /**
     * 该菜品是否完成
     */
    private Integer status;

    /**
     * 价格
     */
    private Integer price;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}