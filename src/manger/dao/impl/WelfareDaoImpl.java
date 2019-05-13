package manger.dao.impl;

import manger.bean.WelfareBean;
import manger.dao.interface_.WelfareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class WelfareDaoImpl implements WelfareDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    public void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }
    @Override
    public int addWelfare(WelfareBean welfareBean) {
        String sql="insert into welfare(accident_insurance,medical_insurance,endowment_insurance,sid) values(?,?,?,?)";

        return jdbcOperations.update(sql,welfareBean.getAccident_insurance(),
                welfareBean.getMedical_insurance(),
                welfareBean.getEndowment_insurance(),
                welfareBean.getSid());
    }

    @Override
    public WelfareBean getWelfareByName(String name){
        String sql="select * from welfare w,staff_record r where w.sid=r.id and r.name=? limit 1";
        return jdbcOperations.queryForObject(sql, new RowMapper<WelfareBean>() {
            @Override
            public WelfareBean mapRow(ResultSet resultSet, int i) throws SQLException {
                WelfareBean welfareBean=new WelfareBean();
                welfareBean.setAccident_insurance(resultSet.getString("accident_insurance"));
                welfareBean.setMedical_insurance(resultSet.getString("medical_insurance"));
                welfareBean.setEndowment_insurance(resultSet.getString("endowment_insurance"));
                welfareBean.setSid(resultSet.getInt("sid"));
                return welfareBean;
            }
        },name);
    }
}
