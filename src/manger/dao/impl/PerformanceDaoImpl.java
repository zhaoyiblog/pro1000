package manger.dao.impl;

import manger.bean.PerformanceBean;
import manger.dao.interface_.PerformanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PerformanceDaoImpl implements PerformanceDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    private void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }

    @Override
    public List<PerformanceBean> getPerforamanceByName(String  name) {
        String sql="select * from performance p ,staff_record s where p.sid=s.id and s.name=?";
        return jdbcOperations.query(sql, new RowMapper<PerformanceBean>() {
            @Override
            public PerformanceBean mapRow(ResultSet resultSet, int i) throws SQLException {
                PerformanceBean performanceBean=new PerformanceBean();
                performanceBean.setClass_adjustment(resultSet.getInt("class_adjustment"));
                performanceBean.setDiscipline_activities(resultSet.getInt("discipline_activities"));
                performanceBean.setUnInvigilate(resultSet.getInt("unInvigilate"));
                performanceBean.setUnmarking(resultSet.getInt("unmarking"));
                performanceBean.setPass_rate(resultSet.getInt("pass_rate"));
                performanceBean.setCompetition_award(resultSet.getInt("competition_award"));
                performanceBean.setComplatint(resultSet.getInt("complatint"));
                performanceBean.setSid(resultSet.getString("name"));
                return performanceBean;
            }
        },name);
    }

    @Override
    public int performanceAdd(PerformanceBean performanceBean,Integer id) {
        String sql="insert into performance(`discipline_activities`, `class_adjustment`, `unInvigilate`, `unmarking`, `pass_rate`, `competition_award`, `complatint`, `sid`) values(?,?,?,?,?,?,?,?)";
        return jdbcOperations.update(sql,performanceBean.getDiscipline_activities(),
                performanceBean.getClass_adjustment(),
                performanceBean.getUnInvigilate(),
                performanceBean.getUnmarking(),
                performanceBean.getPass_rate(),
                performanceBean.getCompetition_award(),
                performanceBean.getComplatint(),
                id
        );
    }
}
