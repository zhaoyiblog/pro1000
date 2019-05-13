package manger.dao.impl;

import manger.bean.SalaryBean;
import manger.dao.interface_.SalaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SalaryDaoImpl implements SalaryDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    private void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }

    @Override
    public int salaryAdd(SalaryBean salaryBean) {
        String sql="insert into salary(sid,base,tech_year,class_number,allowance) values(?,?,?,?,?)";
        return jdbcOperations.update(sql,salaryBean.getSid(),
                salaryBean.getBase(),
                salaryBean.getTech_year(),
                salaryBean.getClass_number(),
                salaryBean.getAllowance());
    }

    @Override
    public SalaryBean getSalaryByName(String name) {
        String sql="select * from salary s,staff_record r where s.sid=r.id and r.name=? limit 1";
        return jdbcOperations.queryForObject(sql, new RowMapper<SalaryBean>() {
            @Override
            public SalaryBean mapRow(ResultSet resultSet, int i) throws SQLException {
                SalaryBean salaryBean=new SalaryBean();
                salaryBean.setBase(resultSet.getInt("base"));
                salaryBean.setTech_year(resultSet.getInt("tech_year"));
                salaryBean.setClass_number(resultSet.getInt("class_number"));
                salaryBean.setAllowance(resultSet.getInt("allowance"));
                return salaryBean;
            }
        },name);
    }


    @Override
    public List<SalaryBean> getSalary() {
        String sql="select * from salary s,staff_record r where s.sid=r.id ";
        return jdbcOperations.query(sql, new RowMapper<SalaryBean>() {
            @Override
            public SalaryBean mapRow(ResultSet resultSet, int i) throws SQLException {
                SalaryBean salaryBean=new SalaryBean();
                salaryBean.setBase(resultSet.getInt("base"));
                salaryBean.setTech_year(resultSet.getInt("tech_year"));
                salaryBean.setClass_number(resultSet.getInt("class_number"));
                salaryBean.setAllowance(resultSet.getInt("allowance"));
                salaryBean.setName(resultSet.getString("name"));
                return salaryBean;
            }
        });
    }
}
