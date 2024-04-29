package com.fanle.resp.order;

import com.fanle.entity.Dish;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Date: 2024/4/29 - 下午3:24
 * @author: mafanle
 */
@Data
public class OrderQueryResp {

    private String name;

    private String description;

    private Integer quantity;

    private Integer price;

    private Integer status;


}
