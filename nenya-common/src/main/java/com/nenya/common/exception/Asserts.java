package com.nenya.common.exception;

/**
 * @author mingyang.ma created on 2020-09-20
 * @version 1.0.0
 * @description 断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String msg) {
        throw new ApiException(msg);
    }

    public static void fail(int code, String msg) {
        throw new ApiException(code, msg);
    }
}
