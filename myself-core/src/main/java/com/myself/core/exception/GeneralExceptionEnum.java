package com.myself.core.exception;

import lombok.Getter;

/**
 * @author aiiiiii
 * @CreateTime: 2024/08/30/10:42
 * 通用异常枚举
 */
@Getter
public enum GeneralExceptionEnum {

    /**
     * 业务异常
     */
    BUSINESS_EXCEPTION(10001, "业务异常");


    private final Integer code;

    private final String message;

    GeneralExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
