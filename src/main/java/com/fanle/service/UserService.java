package com.fanle.service;

import com.fanle.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fanle.req.user.UserLoginReq;
import com.fanle.req.user.UserSaveReq;
import com.fanle.resp.UserLoginResp;

/**
* @author mayao
* @description 针对表【user(user;)】的数据库操作Service
* @createDate 2024-04-25 13:52:40
*/
public interface UserService extends IService<User> {

    Integer register(UserSaveReq req);

    UserLoginResp login(UserLoginReq req);
}
