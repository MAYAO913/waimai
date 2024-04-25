package com.fanle.utils;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.json.JSONObject;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTPayload;
import cn.hutool.jwt.JWTUtil;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class JwtUtil {

    // 盐值很重要，不能泄漏，且每个项目都应该不一样，可以放到配置文件中
    private static final String key = "wzk";

    public static String createToken(Long id, String username) {
        DateTime now = DateTime.now();
        // 2小时后token过期
        DateTime expTime = now.offsetNew(DateField.HOUR, 2);
        Map<String, Object> payload = new HashMap<>();
        // 签发时间
        payload.put(JWTPayload.ISSUED_AT, now);
        // 过期时间
        payload.put(JWTPayload.EXPIRES_AT, expTime);
        // 生效时间
        payload.put(JWTPayload.NOT_BEFORE, now);
        // 内容
        payload.put("id", id);
        payload.put("username", username);
        String token = JWTUtil.createToken(payload, key.getBytes());
        log.info("生成JWT token：{}", token);
        return token;
    }

    public static boolean validate(String token) {
        JWT jwt = JWTUtil.parseToken(token).setKey(key.getBytes(StandardCharsets.UTF_8));
        // 参数表示时间偏差容忍度的整数，单位为秒
        boolean validate = jwt.validate(0);
        log.info("JWT token校验结果：{}", validate);
        return validate;
    }

    public static JSONObject getJSONObject(String token) {
        JWT jwt = JWTUtil.parseToken(token).setKey(key.getBytes());
        JSONObject payloads = jwt.getPayloads();
        payloads.remove(JWTPayload.ISSUED_AT);
        payloads.remove(JWTPayload.EXPIRES_AT);
        payloads.remove(JWTPayload.NOT_BEFORE);
        log.info("根据token获取原始内容：{}", payloads);
        return payloads;
    }

    public static void main(String[] args) {
        // System.out.println(createToken(1L, "wzk"));

        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYmYiOjE3MTQwMzA4NzYsImlkIjoxLCJleHAiOjE3MTQwMzA4OTYsImlhdCI6MTcxNDAzMDg3NiwidXNlcm5hbWUiOiJ3emsifQ.ccxJ53omNcJZtII7R2G5K9qMo6cKTVRTeoOARJHzbOg";
        validate(token);
        getJSONObject(token);
    }
}