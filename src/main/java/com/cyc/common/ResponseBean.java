package com.cyc.common;

/**
 * Created by huzuxing on 2017/7/4.
 */
public class ResponseBean {

    private Integer code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public ResponseBean() {
    }

    public ResponseBean(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
