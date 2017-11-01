package com.keysun.domain;

import java.util.Date;

/**
 * Created by h on 2017/10/31.
 */
public class LoginLog {

    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDatetime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public String getIp() {
        return ip;
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }
}
