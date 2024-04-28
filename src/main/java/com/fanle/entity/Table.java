package com.fanle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName table
 */
@TableName(value ="`table`")
@Data
public class Table implements Serializable {
    /**
     * 唯一ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 桌号
     */
    private Integer tableId;

    /**
     * 餐厅号
     */
    private Integer restaurantId;

    /**
     * 二维码链接
     */
    private String qrCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}