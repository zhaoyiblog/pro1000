package manger.dao.impl;

import manger.bean.ContractBean;
import manger.dao.interface_.ContractDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContractDaoImpl implements ContractDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    private void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }
    @Override
    public int contractAdd(String location, String comment) {
        String sql="insert into contract(location,comment) values(?,?)";
        return jdbcOperations.update(sql,location,comment);
    }

    @Override
    public List<ContractBean> getContract() {
        String sql="select * from contract where 1=1";

        return jdbcOperations.query(sql, new RowMapper<ContractBean>() {
            @Override
            public ContractBean mapRow(ResultSet resultSet, int i) throws SQLException {
                ContractBean contractBean=new ContractBean();
                contractBean.setId(resultSet.getInt("id"));
                contractBean.setLocation(resultSet.getString("location"));
                contractBean.setComment(resultSet.getString("comment"));
                return contractBean;
            }
        });
    }
}
