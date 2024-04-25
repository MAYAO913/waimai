package com.fanle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * ;
 * @TableName restaurant
 */
@TableName(value ="restaurant")
@Data
public class Restaurant implements Serializable {
    /**
     * 餐厅编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 餐厅名称
     */
    private String name;

    /**
     * 餐厅地址
     */
    private String address;

    /**
     * 餐厅联系电话
     */
    private String phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}