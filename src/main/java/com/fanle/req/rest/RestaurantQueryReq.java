package com.fanle.req.rest;

import com.fanle.req.PageReq;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @Date: 2024/4/26 - 上午10:37
 * @author: mafanle
 */
@Data
public class RestaurantQueryReq extends PageReq {

    private Integer id;

    private String name;

    private String address;

    private String phone;
}
