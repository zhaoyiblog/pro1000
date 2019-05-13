package manger.service.impl;

import manger.bean.TransferBean;
import manger.service.interface_.TransferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TransferDaoImpl implements TransferDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    private void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }
    @Override
    public TransferBean getTransferByNameAndId_number(String name, String id_number) {

        String sql="select * from transfer t,staff_record s where t.sid=s.id and s.id_number=?";
        return jdbcOperations.queryForObject(sql, new RowMapper<TransferBean>() {
            @Override
            public TransferBean mapRow(ResultSet resultSet, int i) throws SQLException {
                TransferBean transferBean=new TransferBean();
                transferBean.setSid(resultSet.getInt("sid"));
                transferBean.setFromtime((resultSet.getDate("fromtime")));
                transferBean.setFinaltime((resultSet.getDate("finaltime")));
                transferBean.setIson((resultSet.getString("ison")));
                return transferBean;
            }
        },id_number);
    }


    @Override
    public int addTransferById(TransferBean transferBean) {
        String sql="insert into transfer(fromtime,finaltime,ison,sid) values(?,?,?,?)";
        return jdbcOperations.update(sql,transferBean.getFromtime(),
                transferBean.getFinaltime(),transferBean.getIson(),transferBean.getSid());
    }

    @Override
    public List<TransferBean> getTransferByName(String name) {
        String sql="select * from transfer t,staff_record s where t.sid=s.id and s.name=?";
        return jdbcOperations.query(sql, new RowMapper<TransferBean>() {
            @Override
            public TransferBean mapRow(ResultSet resultSet, int i) throws SQLException {
                TransferBean transferBean=new TransferBean();
                transferBean.setSid(resultSet.getInt("sid"));
                transferBean.setFromtime((resultSet.getDate("fromtime")));
                transferBean.setFinaltime((resultSet.getDate("finaltime")));
                transferBean.setIson((resultSet.getString("ison")));
                return transferBean;
            }
        },name);
    }
}
