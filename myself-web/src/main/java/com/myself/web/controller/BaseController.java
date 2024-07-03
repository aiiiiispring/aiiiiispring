package com.myself.web.controller;

import com.myself.core.api.CommonResult;
import com.myself.core.api.CommonResultHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aiiiiii
 * @CreateTime:2024/07/01/17:31
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @GetMapping("/hello")
    public CommonResult<?> hello() {
        return CommonResultHelper.success("Hello World!");
    }

}
