package com.fanle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.Dish;
import com.fanle.service.DishService;
import com.fanle.mapper.DishMapper;
import org.springframework.stereotype.Service;

/**
* @author mayao
* @description 针对表【dish(;)】的数据库操作Service实现
* @createDate 2024-04-25 13:52:40
*/
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
    implements DishService{

}




