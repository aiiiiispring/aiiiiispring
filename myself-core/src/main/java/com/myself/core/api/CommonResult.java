package com.myself.core.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aiiiiii
 * @Description: 统一返回结果类
 * @CreateTime: 2024/07/01/17:31
 */
@Data
@AllArgsConstructor
public class CommonResult<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -1L;
    private long code;
    private String message;
    private T data;
}
