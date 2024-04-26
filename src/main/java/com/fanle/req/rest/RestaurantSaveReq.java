package com.fanle.req.rest;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

/**
 * ;
 * @TableName restaurant
 */
@TableName(value ="restaurant")
@Data
public class RestaurantSaveReq implements Serializable {

    private Integer id;

    @NotBlank(message = "【name】不能为空")
    private String name;

    @NotBlank(message = "【address】不能为空")
    private String address;

    @NotBlank(message = "【phone】不能为空")
    private String phone;
}