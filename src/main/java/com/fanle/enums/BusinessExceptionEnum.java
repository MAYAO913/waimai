package com.fanle.enums;

/**
 * @Date: 2024/4/25 - 下午2:42
 * @author: mafanle
 */
public enum BusinessExceptionEnum {
    USERNAME_EXIST("用户名已存在！"),
    USER_NOT_EXIST("用户不存在，请先注册！"),
    PASSWORD_ERROR("密码错误"),
    JWT_NOT_AVAILABLE("token格式不正确"),
    DISH_ALREADY_EXIST_IN_THIS_RESTAURANT("该餐厅已存在该菜品"),
    RESTAURANT_ALREADY_EXIST("该餐厅已入驻平台"),

    ;
    private String desc;

    BusinessExceptionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
