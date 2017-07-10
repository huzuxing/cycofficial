package com.cyc.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by huzuxing on 2017/7/4.
 */
@Alias("CycUserLoginLog")
public class CycUserLoginLog implements java.io.Serializable{

    private Integer id;

    private Date loginTime;

    private String loginIp;

    private Integer cate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Integer getCate() {
        return cate;
    }

    public void setCate(Integer cate) {
        this.cate = cate;
    }
}
