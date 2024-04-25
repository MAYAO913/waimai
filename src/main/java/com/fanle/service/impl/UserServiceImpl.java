package com.fanle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.User;
import com.fanle.service.UserService;
import com.fanle.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author mayao
* @description 针对表【user(user;)】的数据库操作Service实现
* @createDate 2024-04-25 13:52:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




