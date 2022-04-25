package com.tuya.lesson.java.util;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 19:34
 */
public class ReturnT<T> {
    boolean success;
    T t;

    public static ReturnT error() {
        ReturnT returnT = new ReturnT();
        returnT.success = false;
        return returnT;
    }

    public static ReturnT<String> error(String msg) {
        ReturnT<String> returnT = error();
        returnT.t = msg;
        return returnT;
    }

    public static ReturnT success() {
        ReturnT returnT = new ReturnT();
        returnT.success = true;
        return returnT;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
