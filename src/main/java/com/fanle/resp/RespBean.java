package com.fanle.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 2024/1/11 - 12:34
 * @author: mafanle
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean<T> {

    private Integer code;
    private String msg;
    private T data;

    public static <T> RespBean<T> ok() {
        RespBean<T> respBean = new RespBean<>();
        respBean.setCode(200);
        respBean.setMsg("success");
        respBean.setData(null);
        return respBean;
    }
    public static <T> RespBean<T> ok(String message) {
        RespBean<T> respBean = new RespBean<>();
        respBean.setCode(200);
        respBean.setMsg(message);
        respBean.setData(null);
        return respBean;
    }
    public static <T> RespBean<T> ok(T data) {
        RespBean<T> respBean = new RespBean<>();
        respBean.setCode(200);
        respBean.setMsg("success");
        respBean.setData(data);
        return respBean;
    }



    public static <T> RespBean<T> error() {
        RespBean<T> respBean = new RespBean<>();
        respBean.setCode(500);
        respBean.setMsg("error");
        respBean.setData(null);
        return respBean;
    }

    public static <T> RespBean<T> error(String msg) {
        RespBean<T> respBean = new RespBean<>();
        respBean.setCode(500);
        respBean.setMsg(msg);
        respBean.setData(null);
        return respBean;
    }

    public static <T> RespBean<T> error(Integer code, String msg, T data) {
        RespBean<T> respBean = new RespBean<>();
        respBean.setCode(code);
        respBean.setMsg(msg);
        respBean.setData(data);
        return respBean;
    }
}
