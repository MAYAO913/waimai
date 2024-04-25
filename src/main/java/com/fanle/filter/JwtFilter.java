package com.fanle.filter;

import cn.hutool.core.util.StrUtil;
import com.fanle.utils.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * @Date: 2024/4/25 - 下午3:52
 * @author: mafanle
 */
@Slf4j
@Component
public class JwtFilter extends OncePerRequestFilter implements Ordered {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        log.info("请求路径：{}", requestURI);
        String[] whiteList = new String[]{"/user/register", "/user/login"};
        // 验证当前请求路径是否在白名单中
        for (String path : whiteList) {
            if (path.equals(requestURI)) {
                // 放行
                log.info("当前请求路径不需要验证：{}", requestURI);
                filterChain.doFilter(request, response);
                return;
            }
        }
        // 需要进一步验证
        String token = request.getHeader("token");
        if (StrUtil.isEmpty(token)) {
            log.error("请求被拦截，token为空");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("Unauthorized: Token is missing or empty");
            return;
        }

        // 校验token
        if (JwtUtil.validate(token)) {
            log.info("token有效");
            filterChain.doFilter(request, response);
        } else {
            log.error("token无效");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("Unauthorized: Token is invalid");
        }
    }

    // 设置优先级，值越小优先级越高
    @Override
    public int getOrder() {
        return 0;
    }
}
