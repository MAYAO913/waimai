package com.fanle.exception;

import com.fanle.enums.BusinessExceptionEnum;

/**
 * @Date: 2024/4/25 - 下午2:47
 * @author: mafanle
 */
public class BusinessException extends RuntimeException{

    private BusinessExceptionEnum businessExceptionEnum;

    public BusinessException(BusinessExceptionEnum businessExceptionEnum) {
        // 调用父类的构造函数，传入异常信息
        super(businessExceptionEnum.getDesc());
        this.businessExceptionEnum = businessExceptionEnum;
    }

    public BusinessExceptionEnum getBusinessExceptionEnum() {
        return businessExceptionEnum;
    }
}
