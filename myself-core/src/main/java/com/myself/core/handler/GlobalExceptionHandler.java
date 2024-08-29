package com.myself.core.handler;

import com.myself.core.api.CommonResult;
import com.myself.core.api.CommonResultHelper;
import com.myself.core.exception.GeneralException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Map;

/**
 * @author aiiiiii
 * @CreateTime: 2024/08/29/17:31
 * 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 全局异常.
     *
     * @param e the e
     * @return CommonResult
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResult<?> handleGlobalException(Exception e, HttpServletRequest request) {
        // 记录请求信息
        log.error("全局异常信息请求地址：{}", request.getRequestURL().toString());
        log.error("全局异常信息请求方法：{}", request.getMethod());
        log.error("全局异常信息请求参数：{}", getRequestParams(request));
        log.error("全局异常信息 ex= {}", e.getMessage(), e);
        return CommonResultHelper.failed(e.getLocalizedMessage());
    }

    private String getRequestParams(HttpServletRequest request) {
        // 获取请求参数，你可能需要根据具体的请求参数获取逻辑进行修改
        Map<String, String[]> paramMap = request.getParameterMap();
        StringBuilder params = new StringBuilder();
        paramMap.forEach((key, values) -> {
            for (String value : values) {
                params.append(key).append("=").append(value).append(",");
            }
        });
        if (!params.isEmpty()) {
            params.deleteCharAt(params.length() - 1);
        }
        return params.toString();
    }

    /**
     * GeneralException 自定义通用异常
     */
    @ExceptionHandler({GeneralException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResult<?> handleGeneralException(GeneralException e) {
        log.error("通用异常:{}", e.getMsg());
        return CommonResultHelper.failed(e.getMsg());
    }


    /**
     * validation Exception
     *
     * @param exception 异常
     * @return CommonResult
     */
    @ExceptionHandler({MethodArgumentNotValidException.class, BindException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult<?> handleBodyValidException(MethodArgumentNotValidException exception) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        StringBuilder errMsg = new StringBuilder();
        for (FieldError fieldError : fieldErrors) {
            errMsg.append(fieldError.getDefaultMessage()).append(",");
        }
        if (!errMsg.isEmpty()) {
            errMsg = new StringBuilder(errMsg.substring(0, errMsg.length() - 1));
        }
        log.error("参数校验异常:{}", errMsg);
        return CommonResultHelper.badRequest(errMsg.toString());
    }
}
