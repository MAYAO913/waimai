package com.fanle.mapper;

import com.fanle.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author mayao
* @description 针对表【dish(;)】的数据库操作Mapper
* @createDate 2024-04-25 13:52:40
* @Entity com.fanle.entity.Dish
*/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}




