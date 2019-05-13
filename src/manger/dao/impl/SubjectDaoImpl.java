package manger.dao.impl;

import manger.dao.interface_.SubjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class SubjectDaoImpl implements SubjectDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    private void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }
    @Override
    public List<Integer> getSubList(Integer staffid) {
        String sql="select * from subject where staffid=?";
        return jdbcOperations.query(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer suid=resultSet.getInt("suid");
                return suid;
            }
        },staffid);
    }
}
