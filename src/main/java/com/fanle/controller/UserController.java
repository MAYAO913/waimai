package com.fanle.controller;

import com.fanle.req.user.UserLoginReq;
import com.fanle.req.user.UserSaveReq;
import com.fanle.resp.RespBean;
import com.fanle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2024/4/25 - 下午1:47
 * @author: mafanle
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param req 用户信息
     * @return 用户ID
     */
    @PostMapping("/register")
    public RespBean register(@RequestBody UserSaveReq req){
        return RespBean.ok(userService.register(req));
    }

    /**
     * 用户登录
     * @param req
     * @return
     */
    @PostMapping("/login")
    public RespBean login(@RequestBody UserLoginReq req){
        return RespBean.ok(userService.login(req));
    }

}
