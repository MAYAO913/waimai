package com.fanle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * ;
 * @TableName dish
 */
@TableName(value ="dish")
@Data
public class Dish implements Serializable {
    /**
     * 菜品编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 餐厅编号
     */
    private Integer restaurantId;

    /**
     * 菜品名称
     */
    private String name;

    /**
     * 菜品描述
     */
    private String description;

    /**
     * 单价
     */
    private Double price;

    /**
     * 是否上架
     */
    private Boolean available;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}