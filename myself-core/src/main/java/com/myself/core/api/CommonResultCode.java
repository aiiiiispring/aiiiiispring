package com.myself.core.api;

import lombok.Getter;

/**
 * @author aiiiiii
 * @CreateTime: 2024/07/01/17:39
 */
@Getter
public enum CommonResultCode {

    SUCCESS(200, "成功"),

    FAILED(500, "失败"),

    BAD_REQUEST(400, "请求参数有误"),

    VALIDATE_FAILED(404, "页面不存在"),

    UNAUTHORIZED(401, "未认证成功"),

    FORBIDDEN(403, "无权限访问");


    private final long code;
    private final String message;

    CommonResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

}
