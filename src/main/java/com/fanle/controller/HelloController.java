package com.fanle.controller;

import com.fanle.req.HelloReq;
import com.fanle.resp.RespBean;
import com.fanle.service.UserService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2024/4/18 - 上午7:57
 * @author: mafanle
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/hello1")
    public RespBean hello1(@Validated @RequestBody HelloReq req){
        return RespBean.ok(req);
    }

    @GetMapping("/hello2")
    public RespBean hello2(@Validated @NotBlank(message = "username不能为空") String username){
        return RespBean.ok(username);
    }

}
