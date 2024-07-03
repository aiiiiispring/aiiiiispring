package com.myself.core.api;

/**
 * @author aiiiiii
 * @CreateTime:2024/07/01/17:39
 */
public enum CommonResultCode {

    SUCCESS(200, "成功"),

    FAILED(500, "失败"),

    VALIDATE_FAILED(404, "页面不存在"),

    UNAUTHORIZED(401, "未认证成功"),

    FORBIDDEN(403, "无权限访问");

    private long code;
    private String message;

    CommonResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
