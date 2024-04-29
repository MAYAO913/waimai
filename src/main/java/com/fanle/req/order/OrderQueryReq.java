package com.fanle.req.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fanle.req.PageReq;
import lombok.Data;

import java.util.Date;

/**
 * @Date: 2024/4/29 - 下午3:21
 * @author: mafanle
 */
@Data
public class OrderQueryReq extends PageReq {


    private Integer userId;

    private Integer restaurantId;

    private Integer tableId;

}
