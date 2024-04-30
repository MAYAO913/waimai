package com.fanle.resp.dish;

import com.fanle.entity.Dish;
import com.fanle.resp.PageResp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Date: 2024/4/25 - 下午7:34
 * @author: mafanle
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishQueryResp extends PageResp {

    private List<Dish> dishes;
}
