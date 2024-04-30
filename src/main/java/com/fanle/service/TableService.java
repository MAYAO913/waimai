package com.fanle.service;

import com.fanle.entity.Table;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fanle.req.table.TableQueryReq;
import com.fanle.req.table.TableSaveReq;
import com.fanle.resp.table.TableQueryResp;

import java.util.List;

/**
* @author mayao
* @description 针对表【table】的数据库操作Service
* @createDate 2024-04-28 14:32:34
*/
public interface TableService extends IService<Table> {

    TableQueryResp getTables(TableQueryReq req);

    Integer insertTable(TableSaveReq req);

    Integer updateTableById(TableSaveReq req);

    Integer deleteTableById(Integer id);
}
