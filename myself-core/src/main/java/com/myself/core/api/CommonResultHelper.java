package com.myself.core.api;

import com.myself.core.exception.GeneralException;

/**
 * @author aiiiiii
 * @Description: 返回结果生成工具
 * @CreateTime: 2024/07/01/18:05
 */
public class CommonResultHelper {

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult<>(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMessage(), null);
    }

    public static <T> CommonResult<T> badRequest() {
        return new CommonResult<>(CommonResultCode.BAD_REQUEST.getCode(), CommonResultCode.BAD_REQUEST.getMessage(), null);
    }

    public static <T> CommonResult<T> badRequest(String message) {
        return new CommonResult<>(CommonResultCode.BAD_REQUEST.getCode(), message, null);
    }

    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<>(CommonResultCode.FAILED.getCode(), message, null);
    }

    public static <T> CommonResult<T> failed() {
        return new CommonResult<>(CommonResultCode.FAILED.getCode(), CommonResultCode.FAILED.getMessage(), null);
    }

    public static <T> CommonResult<T> validateFailed() {
        return new CommonResult<>(CommonResultCode.VALIDATE_FAILED.getCode(), CommonResultCode.VALIDATE_FAILED.getMessage(), null);
    }

    public static <T> CommonResult<T> unauthorized() {
        return new CommonResult<>(CommonResultCode.UNAUTHORIZED.getCode(), CommonResultCode.UNAUTHORIZED.getMessage(), null);
    }

    public static <T> CommonResult<T> forbidden() {
        return new CommonResult<>(CommonResultCode.FORBIDDEN.getCode(), CommonResultCode.FORBIDDEN.getMessage(), null);
    }

    public static <T> CommonResult<T> error(GeneralException e) {
        return new CommonResult<>(e.getStatus(), e.getMsg(), null);
    }
}
