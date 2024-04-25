package com.fanle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.Restaurant;
import com.fanle.service.RestaurantService;
import com.fanle.mapper.RestaurantMapper;
import org.springframework.stereotype.Service;

/**
* @author mayao
* @description 针对表【restaurant(;)】的数据库操作Service实现
* @createDate 2024-04-25 13:52:40
*/
@Service
public class RestaurantServiceImpl extends ServiceImpl<RestaurantMapper, Restaurant>
    implements RestaurantService{

}




