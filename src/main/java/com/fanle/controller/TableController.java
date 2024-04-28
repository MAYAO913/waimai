package com.fanle.controller;

import com.fanle.entity.Table;
import com.fanle.req.table.TableQueryReq;
import com.fanle.req.table.TableSaveReq;
import com.fanle.resp.RespBean;
import com.fanle.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Date: 2024/4/28 - 下午2:35
 * @author: mafanle
 */
@RequestMapping("/table")
@RestController
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping("/getByCondition")
    public RespBean<List<Table>> getTables(@RequestBody TableQueryReq req){
        return RespBean.ok(tableService.getTables(req));
    }

    @PostMapping("/insert")
    public RespBean insertTable(@RequestBody TableSaveReq req){
        return RespBean.ok(tableService.insertTable(req));
    }

    @PutMapping("/update")
    public RespBean updateTableById(@RequestBody TableSaveReq req){
        return RespBean.ok(tableService.updateTableById(req));
    }

    @DeleteMapping("/delete/{id}")
    public RespBean deleteTableById(@PathVariable("id") Integer id){
        return RespBean.ok(tableService.deleteTableById(id));
    }
}
