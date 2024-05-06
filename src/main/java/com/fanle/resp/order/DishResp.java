package com.fanle.resp.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Date: 2024/5/6 - 下午3:42
 * @author: mafanle
 */
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class DishResp {

    private Integer dishId;

    private String name;

    private Integer quantity;
}
