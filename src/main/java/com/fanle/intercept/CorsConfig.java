package com.fanle.intercept;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Date: 2024/4/29 - 下午7:45
 * @author: mafanle
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*") // 允许所有域名
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 允许的请求方法
                .allowedHeaders("Authorization", "Content-Type") // 允许的请求头部
                .allowCredentials(true) // 允许发送 cookie
                .maxAge(3600); // 预检请求的有效期，单位秒
    }
}
