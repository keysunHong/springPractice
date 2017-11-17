package com.keysun.login.dao;

import com.keysun.login.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by h on 2017/10/31.
 */
@Repository
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer getMatchCount(String userName, String passwd) {
        String sql = "select count(*) from t_user where user_name = ? and passwd = ? ";
        return jdbcTemplate.queryForObject(sql, new Object[]{userName, passwd}, Integer.class);
    }

    public User findUserByUserName(final String userName) {
        String sql = "select * from t_user where user_name = ? ";
        final User user = new User();
        jdbcTemplate.query(sql, new Object[]{userName}, new RowCallbackHandler(){
            public void processRow(ResultSet rs) throws SQLException {
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(userName);
                user.setCredits(rs.getInt("credits")+5);
            }
        });
        return user;
    }

    public int updateLoginInfo(User user) {
        String sql = "update t_user set credits = ?,last_visit = ?,last_ip = ? where user_name = ? and passwd = ?  ";
        return jdbcTemplate.update(sql, new Object[]{user.getUserId(), user.getLastDatetime(), user.getLastIp(), user.getUserName(),user.getPasswd()});
    }
}
