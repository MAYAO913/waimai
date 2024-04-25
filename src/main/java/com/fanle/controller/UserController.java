package com.fanle.controller;

import com.fanle.req.user.UserSaveReq;
import com.fanle.resp.RespBean;
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

    @PostMapping("/register")
    public RespBean register(@RequestBody UserSaveReq req){
        return RespBean.ok();
    }

    @PostMapping("/sendCode")
    public RespBean sendCode(@RequestBody UserSaveReq req){
        return RespBean.ok();
    }

    @PostMapping("/login")
    public RespBean login(@RequestBody UserSaveReq req){
        return RespBean.ok();
    }

}
