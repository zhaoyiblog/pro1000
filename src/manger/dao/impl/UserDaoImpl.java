package manger.dao.impl;

import manger.bean.UserBean;
import manger.dao.interface_.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    public void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }
    @Override
    public int addUser(UserBean userBean) {
        String sql="insert into user(name,j_number,role,password) values(?,?,?,?)";
        int ref=jdbcOperations.update(sql,
                userBean.getName(),
                userBean.getJ_number(),
                userBean.getRole(),
                userBean.getPassword());
        return ref;
    }

    @Override
    public int userLogin(UserBean userBean) {
        String  sql="select count(*) from user where j_number=? and password=?";
        int count = jdbcOperations.queryForObject(sql,Integer.class,userBean.getJ_number(),userBean.getPassword());
        return count;
    }

    @Override
    public UserBean getUserByJ_number(Integer J_number) {
        String sql="select * from user where j_number=? limit 1";
        UserBean userBean=jdbcOperations.queryForObject(sql, new RowMapper<UserBean>() {
            @Override
            public UserBean mapRow(ResultSet resultSet, int i) throws SQLException {
                UserBean userBean=new UserBean();
                userBean.setName(resultSet.getString("name"));
                userBean.setPassword(resultSet.getString("password"));
                userBean.setJ_number(resultSet.getInt("j_number"));
                userBean.setId(resultSet.getInt("id"));
                return userBean;
            }
        },J_number);
        return userBean;
    }

    @Override
    public int updateUserBeanById(UserBean userBean) {
        String sql="update user set name=?,password=? where id=?";
        return this.jdbcOperations.update(sql,userBean.getName(),
                userBean.getPassword(),
                userBean.getId()
        );
    }

}
