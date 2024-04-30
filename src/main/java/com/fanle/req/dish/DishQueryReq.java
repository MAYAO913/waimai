package com.fanle.req.dish;

import com.fanle.req.PageReq;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Date: 2024/4/26 - 上午9:08
 * @author: mafanle
 */
@Data
public class DishQueryReq extends PageReq {

    private Integer id;

    private Integer restaurantId;

    private String name;

    private String description;

    private String category;

    private String img;

    private Double price;

    private Boolean available;

}
