package com.fanle.resp.order;

import com.fanle.entity.Dish;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * @Date: 2024/4/29 - 下午3:24
 * @author: mafanle
 */
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderQueryResp {

    private Integer id;

    private Integer tableId;

    private Integer restaurantId;

    private List<DishResp> dishes;

    private Integer totalPrice;

    private Boolean status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;
}
