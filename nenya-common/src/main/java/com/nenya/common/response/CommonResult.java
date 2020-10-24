package com.nenya.common.response;

/**
 * @author mingyang.ma created on 2020-09-16
 * @version 1.0.0
 * @description 统一结果返回
 */
public class CommonResult<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据封装
     */
    private T data;

    /**
     * 方法描述:无参构造器
     * 创建时间:2020-09-16 07:32
     *
     * @return CommonResult
     * @author mingyang.ma
     */
    protected CommonResult() {
    }

    /**
     * 方法描述:全参构造器
     * 创建时间:2020-09-16 07:31
     *
     * @param code    状态码
     * @param message 消息提示
     * @param data    数据
     * @return CommonResult
     * @author mingyang.ma
     */
    protected CommonResult(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    /**
     * 方法描述: 返回成功
     * 创建时间:2020-09-16 07:44
     *
     * @param data
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMsg(), data);
    }

    /**
     * 方法描述: 返回成功
     * 创建时间:2020-09-16 07:44
     *
     * @param msg  消息提示
     * @param data 数据
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> success(String msg, T data) {
        return new CommonResult<>(CommonCode.SUCCESS.getCode(), msg, data);
    }

    /**
     * 方法描述: 返回失败
     * 创建时间:2020-09-17 07:44
     *
     * @param msg 消息提示
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> failed(int code, String msg) {
        return new CommonResult<>(code, msg, null);
    }

    /**
     * 方法描述:返回失败
     * 创建时间:2020-09-17 07:16
     *
     * @param msg 消息提示
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> failed(String msg) {
        return new CommonResult<>(CommonCode.FAILED.getCode(), msg, null);
    }

    /**
     * 方法描述:返回失败
     * 创建时间:2020-09-17 07:16
     *
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> failed() {
        return new CommonResult<>(CommonCode.FAILED.getCode(), CommonCode.FAILED.getMsg(), null);
    }

    /**
     * 方法描述:参数验证失败返回结果
     * 创建时间:2020-09-17 07:22
     *
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(CommonCode.VALIDATE_FAILED.getCode(), CommonCode.VALIDATE_FAILED.getMsg());
    }

    /**
     * 方法描述:参数验证失败返回结果
     * 创建时间:2020-09-17 07:22
     *
     * @param msg 提示信息
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> validateFailed(String msg) {
        return new CommonResult<T>(CommonCode.VALIDATE_FAILED.getCode(), msg, null);
    }

    /**
     * 方法描述:未登录返回结果
     * 创建时间:2020-09-17 07:23
     *
     * @param data 数据
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(CommonCode.UNAUTHORIZED.getCode(), CommonCode.UNAUTHORIZED.getMsg(), data);
    }

    /**
     * 方法描述:未授权返回结果
     * 创建时间:2020-09-17 07:24
     *
     * @param data 数据
     * @return com.nenya.common.response.CommonResult<T>
     * @author mingyang.ma
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(CommonCode.FORBIDDEN.getCode(), CommonCode.FORBIDDEN.getMsg(), data);
    }

    public int getCode() {
        return code;
    }

    public CommonResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public CommonResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public CommonResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
