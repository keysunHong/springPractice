package com.keysun.login.service;

import com.keysun.login.dao.LoginLogDao;
import com.keysun.login.dao.UserDao;
import com.keysun.login.domain.LoginLog;
import com.keysun.login.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by h on 2017/10/31.
 */
@Service
public class UserService {

    private UserDao userDao;
    private LoginLogDao loginLogDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setLoginLogDao(LoginLogDao loginLogDao) {
        this.loginLogDao = loginLogDao;
    }

    public boolean hasMatchUser(String userName,String passwd){
        Integer matchCount = userDao.getMatchCount(userName, passwd);
        if(matchCount.intValue()>0){
            return true;
        }
        return false;
    }


    public User findUserByUserName(String userName){
        User userByUserName = userDao.findUserByUserName(userName);
        return userByUserName;
    }

    public void loginSuccess(User user){
        user.setCredits(5+user.getCredits());
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDatetime(user.getLastDatetime());
        int i = userDao.updateLoginInfo(user);
        System.out.println(i);
        int m = loginLogDao.insertLoginLog(loginLog);
        System.out.println(m);
    }
}
