package com.fanle.mapper;

import com.fanle.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author mayao
* @description 针对表【user(user;)】的数据库操作Mapper
* @createDate 2024-04-25 13:52:40
* @Entity com.fanle.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




