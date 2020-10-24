package com.nenya.common.exception;

import com.nenya.common.response.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * @author mingyang.ma created on 2020-09-20
 * @version 1.0.0
 * @description 全局异常
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public CommonResult handleValidException(BindException e) {
        log.info("绑定类异常");
        BindingResult bindingResult = e.getBindingResult();
        String message = baseExceptionMsg(bindingResult);
        return CommonResult.validateFailed(message);
    }

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonResult handleValidException(MethodArgumentNotValidException e) {
        log.info("方法参数未校验异常");
        BindingResult bindingResult = e.getBindingResult();
        String message = baseExceptionMsg(bindingResult);
        return CommonResult.validateFailed(message);
    }

    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public CommonResult globalExceptionHandler(ApiException e) {
        log.info("自定义异常");
        if (Objects.nonNull(e)) {
            return CommonResult.failed(e.getCode(), e.getMsg());
        }
        return CommonResult.failed(e.getMessage());
    }

    /**
     * 方法描述:异常输出基类
     * 创建时间:2020-09-20 08:09
     *
     * @param bindingResult 绑定异常结果
     * @return java.lang.String
     * @author mingyang.ma
     */
    private String baseExceptionMsg(BindingResult bindingResult) {
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField() + fieldError.getDefaultMessage();
            }
        }
        return message;
    }
}
