package com.fanle.resp.table;

import com.fanle.entity.Table;
import com.fanle.resp.PageResp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Date: 2024/4/30 - 下午3:17
 * @author: mafanle
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableQueryResp extends PageResp {

    private List<Table> tables;
}
