package manger.dao.impl;

import manger.bean.CheckingBean;
import manger.dao.interface_.CheckingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CheckingDaoImpl implements CheckingDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    private void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }
    @Override
    public CheckingBean selCheck(int year,int month,String name) {
        String sql ="select * from checking_in c,staff_record s where c.sid=s.id and c.year=? and c.month=? and s.name=? limit 1";
        return jdbcOperations.queryForObject(sql, new RowMapper<CheckingBean>() {
            @Override
            public CheckingBean mapRow(ResultSet resultSet, int i) throws SQLException {
                CheckingBean checkingBean= new CheckingBean();
                checkingBean.setName(resultSet.getString("name"));
                checkingBean.setOn_time(resultSet.getInt("on_time"));
                checkingBean.setYear(resultSet.getInt("year"));
                checkingBean.setMonth(resultSet.getInt("month"));
                return checkingBean;
            }
        },year,month,name);
    }

    @Override
    public int checkAdd(CheckingBean checkingBean) {
        String sql="insert into checking_in(on_time,year,month,sid) values(?,?,?,?)";
        return jdbcOperations.update(sql,checkingBean.getOn_time(),checkingBean.getYear(),checkingBean.getMonth(),checkingBean.getSid());
    }


    @Override
    public List<CheckingBean> selCheck() {
        String sql ="select * from checking_in c,staff_record s where c.sid=s.id ";
        return jdbcOperations.query(sql, new RowMapper<CheckingBean>() {
            @Override
            public CheckingBean mapRow(ResultSet resultSet, int i) throws SQLException {
                CheckingBean checkingBean= new CheckingBean();
                checkingBean.setName(resultSet.getString("name"));
                checkingBean.setOn_time(resultSet.getInt("on_time"));
                checkingBean.setYear(resultSet.getInt("year"));
                checkingBean.setMonth(resultSet.getInt("month"));
                return checkingBean;
            }
        });
    }
}
