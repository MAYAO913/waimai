package com.fanle.resp;

import lombok.Data;

/**
 * @Date: 2024/4/30 - 下午1:16
 * @author: mafanle
 */
@Data
public class PageResp {

    private Integer pageNum;
    private Integer pageSize;
    private Integer total;
}
