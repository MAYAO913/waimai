package com.fanle.mapper;

import com.fanle.entity.Table;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanle.req.table.TableQueryReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author mayao
* @description 针对表【table】的数据库操作Mapper
* @createDate 2024-04-28 14:32:34
* @Entity com.fanle.entity.Table
*/
@Mapper
public interface TableMapper extends BaseMapper<Table> {

    List<Table> selectListByCondition(@Param("req") TableQueryReq req,
                                      @Param("start") Integer start,
                                      @Param("pageSize") Integer pageSize);
}




