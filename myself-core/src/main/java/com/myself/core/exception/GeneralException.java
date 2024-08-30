package com.myself.core.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * @author aiiiiii
 * @CreateTime: 2024/08/29/17:50
 * 自定义通用异常
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GeneralException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer status;

    private String msg;

    public GeneralException(String msg) {
        this.status = 500;
        this.msg = msg;
    }

    public GeneralException(GeneralExceptionEnum generalExceptionEnum) {
        this.status = generalExceptionEnum.getCode();
        this.msg = generalExceptionEnum.getMessage();
    }

}
