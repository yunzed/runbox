package com.topcall.runbox.util;

/**
 * Created by yunzed on 2017/1/7.
 */
public class Result {
    private int code;
    private Object data;
    private String msg;

    public Result(int code, Object data) {
        this.setCode(code);
        this.setData(data);
    }

    public Result(int code, String msg) {
        this.setCode(code);
        this.setMsg(msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
