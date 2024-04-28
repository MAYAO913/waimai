package com.fanle.enums;

/**
 * @Date: 2024/4/28 - 下午2:15
 * @author: mafanle
 */
public enum UserInfoEnum {
    TOURISTS("游客"),
    MEMBER("会员"),
    ADMINISTRATOR("管理员")
    ;

    private String role;

    UserInfoEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
