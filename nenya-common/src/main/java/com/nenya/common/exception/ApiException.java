package com.nenya.common.exception;

/**
 * @author mingyang.ma created on 2020-09-20
 * @version 1.0.0
 * @description 自定义接口异常及业务异常
 */
public class ApiException extends RuntimeException {
    /**
     * code 码值
     */
    private int code;
    /**
     * 消息提示
     */
    private String msg;

    public ApiException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiException(String msg) {
        super(msg);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public int getCode() {
        return code;
    }

    public ApiException setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ApiException setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
