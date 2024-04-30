package com.fanle.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.Restaurant;
import com.fanle.entity.Table;
import com.fanle.entity.Table;
import com.fanle.enums.BusinessExceptionEnum;
import com.fanle.exception.BusinessException;
import com.fanle.req.table.TableQueryReq;
import com.fanle.req.table.TableSaveReq;
import com.fanle.resp.table.TableQueryResp;
import com.fanle.service.TableService;
import com.fanle.mapper.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author mayao
* @description 针对表【table】的数据库操作Service实现
* @createDate 2024-04-28 14:32:34
*/
@Service
public class TableServiceImpl extends ServiceImpl<TableMapper, Table>
    implements TableService{

    @Autowired
    private TableMapper tableMapper;

    @Override
    public TableQueryResp getTables(TableQueryReq req) {
        Integer start = null;
        Integer pageNum = req.getPageNum();
        Integer pageSize = req.getPageSize();
        if (ObjectUtil.isNotNull(pageNum) && ObjectUtil.isNotNull(pageSize)){
            start = (pageNum - 1) * pageSize;
        }
        List<Table> tables = tableMapper.selectListByCondition(req, start, pageSize);
        int total = tableMapper.selectCountByCondition(req);
        TableQueryResp resp = new TableQueryResp();
        resp.setTables(tables);
        resp.setPageNum(pageNum);
        resp.setPageSize(pageSize);
        resp.setTotal(total);
        return resp;
    }

    @Override
    public Integer insertTable(TableSaveReq req) {
        // 查看是否存在该餐厅
        Table tableDB = tableMapper.selectOne(new LambdaQueryWrapper<Table>()
                .eq(Table::getTableId, req.getTableId())
                .eq(Table::getRestaurantId, req.getRestaurantId()));
        if (ObjectUtil.isNotNull(tableDB)){
            throw new BusinessException(BusinessExceptionEnum.TABLE_ALREADY_EXIST_IN_THIS_RESTAURANT);
        }
        Table table = BeanUtil.copyProperties(req, Table.class);
        return tableMapper.insert(table);
    }

    @Override
    public Integer updateTableById(TableSaveReq req) {
        return tableMapper.updateById(BeanUtil.copyProperties(req, Table.class));
    }

    @Override
    public Integer deleteTableById(Integer id) {
        return tableMapper.deleteById(id);
    }
}




