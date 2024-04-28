package com.fanle.req.table;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName table
 */
@Data
public class TableSaveReq implements Serializable {

    private Integer id;

    @NotNull(message = "【tableId】不能为空!")
    private Integer tableId;

    @NotNull(message = "【restaurantId】不能为空!")
    private Integer restaurantId;

    @NotBlank(message = "【qrCode】不能为空!")
    private String qrCode;

}