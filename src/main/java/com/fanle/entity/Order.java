package com.fanle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ;
 * @TableName order
 */
@TableName(value ="`order`")
@Data
public class Order implements Serializable {
    /**
     * 订单编号
     */
    @TableId(type = IdType.AUTO)
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}