package com.fanle.req.table;

import com.fanle.req.PageReq;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName table
 */
@Data
public class TableQueryReq extends PageReq {

    private Integer id;

    private Integer tableId;

    private Integer restaurantId;

    private String qrCode;

}