package com.fanle.resp.rest;

import com.fanle.entity.Restaurant;
import com.fanle.resp.PageResp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Date: 2024/4/30 - 下午1:16
 * @author: mafanle
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantQueryResp extends PageResp {

    private List<Restaurant> restaurants;
}
