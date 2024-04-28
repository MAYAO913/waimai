package com.fanle.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanle.entity.User;
import com.fanle.enums.BusinessExceptionEnum;
import com.fanle.exception.BusinessException;
import com.fanle.req.user.UserLoginReq;
import com.fanle.req.user.UserSaveReq;
import com.fanle.resp.user.UserLoginResp;
import com.fanle.service.UserService;
import com.fanle.mapper.UserMapper;
import com.fanle.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author mayao
* @description 针对表【user(user;)】的数据库操作Service实现
* @createDate 2024-04-25 13:52:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer register(UserSaveReq req) {
        // 首先查看用户名是否存在
        User userDB = getUserDB(req.getUsername());
        // 用户名存在
        if (ObjectUtil.isNotNull(userDB)){
            throw new BusinessException(BusinessExceptionEnum.USERNAME_EXIST);
        }
        // 用户名不存在，注册
        User user = BeanUtil.copyProperties(req, User.class);
        // 密码使用MD5加密
        user.setPassword(DigestUtil.md5Hex(req.getPassword()));
        return userMapper.insert(user);
    }

    private User getUserDB(String username) {
        User userDB = userMapper.selectOne(new LambdaQueryWrapper<User>()
                .eq(User::getUsername, username));
        return userDB;
    }

    @Override
    public UserLoginResp login(UserLoginReq req) {
        // 检查用户是否存在
        User userDB = getUserDB(req.getUsername());
        // 用户名不存在
        if (ObjectUtil.isNull(userDB)){
            throw new BusinessException(BusinessExceptionEnum.USER_NOT_EXIST);
        }
        // 校验密码
        if (!DigestUtil.md5Hex(req.getPassword()).equals(userDB.getPassword())){
            throw new BusinessException(BusinessExceptionEnum.PASSWORD_ERROR);
        }
        // TODO 区分用户身份
        // 生成token返回前端
        String token = JwtUtil.createToken(userDB.getId().longValue(), req.getUsername());
        UserLoginResp userLoginResp = BeanUtil.copyProperties(userDB, UserLoginResp.class);
        userLoginResp.setToken(token);
        return userLoginResp;
    }


}




