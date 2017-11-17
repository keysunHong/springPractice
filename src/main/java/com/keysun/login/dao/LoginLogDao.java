package com.keysun.login.dao;

import com.keysun.login.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by h on 2017/10/31.
 */
@Repository
public class LoginLogDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insertLoginLog(LoginLog loginLog){
        String sql = "insert into t_login_log(user_id , ip , login_datetime) values(? , ? , ?)";
        return jdbcTemplate.update(sql,new Object[]{loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDatetime()});
    }
}
