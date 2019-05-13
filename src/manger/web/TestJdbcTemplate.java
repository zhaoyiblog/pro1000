package manger.web;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import manger.config.RootConfig;
import manger.bean.Test;

/**
 * 测试JdbcTemplate是否可用
 */
public class TestJdbcTemplate {
    private static  final String sql="select message from test where message='message1'";
    public static void main(String[] args) {
        RootConfig rc = new RootConfig();
        DataSource ds = rc.dataSource();
        JdbcOperations jdbcOperations = rc.jdbcTemplate(ds);


        Test spittr=jdbcOperations.queryForObject(sql, new RowMapper<Test>() {
            @Override
            public Test mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Test(
                        resultSet.getString("message"));
            }
        });
        System.out.println(spittr.getMessage());
    }
}
