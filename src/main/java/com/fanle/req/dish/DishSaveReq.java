package com.fanle.req.dish;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Date: 2024/4/25 - 下午7:34
 * @author: mafanle
 */
@Data
public class DishSaveReq {

    private Integer id;

    @Min(value = 1, message = "【restaurantId】必须大于等于1！")
    @NotNull(message = "【restaurantId】不能为空")
    private Integer restaurantId;

    @NotBlank(message = "【name】不能为空")
    private String name;

    @NotBlank(message = "【description】不能为空")
    private String description;

    @Min(value = 1, message = "【restaurantId】必须大于等于1！")
    private Double price;

    @NotNull(message = "【available】不能为空")
    private Boolean available;
}
