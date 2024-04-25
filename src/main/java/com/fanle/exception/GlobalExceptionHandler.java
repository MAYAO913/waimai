package com.fanle.exception;

import com.fanle.resp.RespBean;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Date: 2024/4/25 - 上午11:42
 * @author: mafanle
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局校验异常
     * 对于@RequestBody参数校验失败时，会抛出MethodArgumentNotValidException异常
     * @param e 异常
     * @return 异常信息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RespBean handlerMethodArgumentNotValidException(MethodArgumentNotValidException e){
        log.error("校验异常：{}",e.getBindingResult().getFieldError().getDefaultMessage());
        return RespBean.error(e.getBindingResult().getFieldError().getDefaultMessage());
    }

    /**
     * 全局校验异常
     * 对于@RequestBody参数校验失败时，会抛出MethodArgumentNotValidException异常
     * @param e 异常
     * @return 异常信息
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public RespBean handleConstraintViolationException(ConstraintViolationException e){
        log.error("ConstraintViolationException: {}", e.getMessage());
        return RespBean.error(e.getMessage());
    }

}
