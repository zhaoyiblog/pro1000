package manger.dao.impl;

import manger.bean.Test;
import manger.dao.interface_.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
@Repository
public class TestDaoImpl implements TestDao {

    private JdbcOperations jdbcOperations;
    @Autowired
    public void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }
    @Override
    public Test test() {
        String sql="select message from test where message='和谐'";
        Test test=jdbcOperations.queryForObject(sql, new RowMapper<Test>() {
            @Override
            public Test mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Test(
                        resultSet.getString("message"));
            }
        });
        return test;
    }
}
