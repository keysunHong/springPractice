package com.keysun.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by h on 2017/10/31.
 */
public class User implements Serializable{
    private int userId;
    private String userName;
    private String passwd;
    private int credits;
    private String lastIp;
    private Date lastDatetime;



    public String getPasswd() {
        return passwd;
    }

    public int getCredits() {
        return credits;
    }

    public String getLastIp() {
        return lastIp;
    }

    public Date getLastDatetime() {
        return lastDatetime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public void setLastDatetime(Date lastDatetime) {
        this.lastDatetime = lastDatetime;
    }
}
