package com.keysun.login.service;

import com.keysun.login.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by h on 2017/10/31.
 */
@ContextConfiguration("classpath*:/keysun-context.xml")
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests{

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void hasMatch(){
        boolean b1 = userService.hasMatchUser("admin", "123456");
        assertTrue(b1);
    }

    @Test
    public void findUserByUserName(){
        User admin = userService.findUserByUserName("admin");
        assertEquals(admin.getUserName(),"admin");
    }

    @Test
    public void loginSuccess(){
        User user = new User();
        user.setUserName("admin");
        user.setPasswd("123456");
        user.setCredits(10);
        user.setLastIp("127.0.0.1");
        user.setLastDatetime(new Date());
        userService.loginSuccess(user);
    }
}
