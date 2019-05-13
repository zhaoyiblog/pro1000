package manger.dao.impl;

import manger.bean.RecordBean;
import manger.bean.RecordBean_;
import manger.bean.RecordDictBean;
import manger.bean.RecordDictRawBean;
import manger.dao.interface_.RecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class RecordDaoImpl  implements RecordDao {
    private JdbcOperations jdbcOperations;
    @Autowired
    private void setJdbcOperations(JdbcOperations jdbcOperations){
        this.jdbcOperations=jdbcOperations;
    }

    @Override
    public int recordAdd(RecordBean recordBean) {
        String sql="insert into staff_record(name,nation,sex,politics_status,profession_title,education,degree,education_school,degree_school,position,department,phone,is_authorized,id_number,pic,nationality,birth,address,married,major,towork,educationexp) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcOperations.update(sql,
                recordBean.getName(),
                recordBean.getNation(),
                recordBean.getSex(),
                recordBean.getPolitics_status(),
                recordBean.getProfession_title(),
                recordBean.getEducation(),
                recordBean.getDegree(),
                recordBean.getEducation_school(),
                recordBean.getDegree_school(),
                recordBean.getPosition(),
                recordBean.getDepartment(),
                recordBean.getPhone(),
                recordBean.getIs_authorized(),
                recordBean.getId_number(),
                recordBean.getPic(),
                recordBean.getNationality(),
                recordBean.getBirth(),
                recordBean.getAddress(),
                recordBean.getMarried(),
                recordBean.getMajor(),
                recordBean.getToWork(),
                recordBean.getEducationexp()
                );
    }

    /**
     * 取出所需字典
     * @return
     */
    @Override
    public List<RecordDictRawBean> recordDictSel() {
        String sql="select * from dictionary";
        List<RecordDictRawBean> recordDictRawBeanList=jdbcOperations.query(sql,new RowMapper<RecordDictRawBean>(){
            @Override
            public RecordDictRawBean mapRow(ResultSet resultSet, int i) throws SQLException {
                RecordDictRawBean recordDictRawBean= new RecordDictRawBean();
                recordDictRawBean.setId(resultSet.getInt("id"));
                recordDictRawBean.setType(resultSet.getString("type"));
                recordDictRawBean.setIndex(resultSet.getInt("index"));
                recordDictRawBean.setAttribute(resultSet.getString("attribute"));
                return recordDictRawBean;
            }
    });
        return recordDictRawBeanList;
}

    @Override
    public List<RecordBean> recordSelByName(String name) {


        String  sql ="select * from staff_record where name like ?";

        return jdbcOperations.query(sql,new RowMapper<RecordBean>(){
            @Override
            public RecordBean mapRow(ResultSet resultSet, int i) throws SQLException {
                RecordBean recordBean= new RecordBean();
                recordBean.setId(resultSet.getInt("id"));
                recordBean.setDegree(resultSet.getInt("degree"));
                recordBean.setName(resultSet.getString("name"));
                recordBean.setNation(resultSet.getInt("nation"));
                recordBean.setSex(resultSet.getInt("sex"));
                recordBean.setPolitics_status(resultSet.getInt("politics_status"));
                recordBean.setEducation(resultSet.getInt("education"));
                recordBean.setDegree(resultSet.getInt("degree"));
                recordBean.setEducation_school(resultSet.getString("education_school"));
                recordBean.setDegree_school(resultSet.getString("degree_school"));
                recordBean.setPosition(resultSet.getInt("position"));
                recordBean.setDepartment(resultSet.getInt("department"));
                recordBean.setPhone(resultSet.getString("phone"));
                recordBean.setIs_authorized(resultSet.getInt("is_authorized"));
                recordBean.setProfession_title(resultSet.getInt("profession_title"));
                recordBean.setId_number(resultSet.getString("id_number"));
                recordBean.setPic(resultSet.getString("pic"));
                recordBean.setNationality(resultSet.getInt("nationality"));
                recordBean.setBirth(resultSet.getDate("birth"));
                recordBean.setToWork(resultSet.getDate("towork"));
                recordBean.setAddress(resultSet.getString("address"));
                recordBean.setMarried(resultSet.getInt("married"));
                recordBean.setMajor(resultSet.getString("major"));
                recordBean.setEducationexp(resultSet.getString("educationexp"));
                return recordBean;
            }
        },"%"+name+"%");
    }

    @Override
    public List<RecordBean> recordSel() {
        String  sql ="select * from staff_record where 1=1";

        return jdbcOperations.query(sql,new RowMapper<RecordBean>(){
            @Override
            public RecordBean mapRow(ResultSet resultSet, int i) throws SQLException {
                RecordBean recordBean= new RecordBean();
                recordBean.setId(resultSet.getInt("id"));
                recordBean.setDegree(resultSet.getInt("degree"));
                recordBean.setName(resultSet.getString("name"));
                recordBean.setNation(resultSet.getInt("nation"));
                recordBean.setSex(resultSet.getInt("sex"));
                recordBean.setPolitics_status(resultSet.getInt("politics_status"));
                recordBean.setEducation(resultSet.getInt("education"));
                recordBean.setDegree(resultSet.getInt("degree"));
                recordBean.setEducation_school(resultSet.getString("education_school"));
                recordBean.setDegree_school(resultSet.getString("degree_school"));
                recordBean.setPosition(resultSet.getInt("position"));
                recordBean.setDepartment(resultSet.getInt("department"));
                recordBean.setPhone(resultSet.getString("phone"));
                recordBean.setIs_authorized(resultSet.getInt("is_authorized"));
                recordBean.setProfession_title(resultSet.getInt("profession_title"));
                recordBean.setId_number(resultSet.getString("id_number"));
                recordBean.setPic(resultSet.getString("pic"));
                recordBean.setNationality(resultSet.getInt("nationality"));
                recordBean.setBirth(resultSet.getDate("birth"));
                recordBean.setToWork(resultSet.getDate("towork"));
                recordBean.setAddress(resultSet.getString("address"));
                recordBean.setMarried(resultSet.getInt("married"));
                recordBean.setMajor(resultSet.getString("major"));
                recordBean.setEducationexp(resultSet.getString("educationexp"));
                return recordBean;
            }
        });
    }

    @Override
    public int recordUpdateById(RecordBean recordBean) {
        String sql="update staff_record set name=?,nation=?,sex=?,politics_status=?,profession_title=?,education=?,degree=?,education_school=?,degree_school=?,position=?,department=?,phone=?,is_authorized=?,id_number=?,nationality=?,birth=?,address=?,married=?,major=?,towork=?,educationexp=? where id=?";
        return jdbcOperations.update(sql,
                recordBean.getName(),
                recordBean.getNation(),
                recordBean.getSex(),
                recordBean.getPolitics_status(),
                recordBean.getProfession_title(),
                recordBean.getEducation(),
                recordBean.getDegree(),
                recordBean.getEducation_school(),
                recordBean.getDegree_school(),
                recordBean.getPosition(),
                recordBean.getDepartment(),
                recordBean.getPhone(),
                recordBean.getIs_authorized(),
                recordBean.getId_number(),
                recordBean.getNationality(),
                recordBean.getBirth(),
                recordBean.getAddress(),
                recordBean.getMarried(),
                recordBean.getMajor(),
                recordBean.getToWork(),
                recordBean.getEducationexp(),
                recordBean.getId()
                );
    }

    @Override
    public int getIdByName(String name) {
        String sql="select id from staff_record where name=? limit 1";
        return jdbcOperations.queryForObject(sql,Integer.class,name);
    }

    @Override
    public int updateSubject(Integer suid, Integer staffid) {
        String sql="insert into subject(suid,staffid) values(?,?)";
        return jdbcOperations.update(sql,suid,staffid);
    }

    @Override
    public int delSubjectByStaff(Integer staffid) {
        return jdbcOperations.update("delete from subject where staffid=?",staffid);
    }

    @Override
    public RecordBean getRecordBeanById(int id) {
        String sql="select * from staff_record where id=?";
        RecordBean recordBean=jdbcOperations.queryForObject(sql,new RowMapper<RecordBean>(){
            @Override
            public RecordBean mapRow(ResultSet resultSet, int i) throws SQLException {
                RecordBean recordBean= new RecordBean();
                recordBean.setId(resultSet.getInt("id"));
                recordBean.setDegree(resultSet.getInt("degree"));
                recordBean.setName(resultSet.getString("name"));
                recordBean.setNation(resultSet.getInt("nation"));
                recordBean.setSex(resultSet.getInt("sex"));
                recordBean.setPolitics_status(resultSet.getInt("politics_status"));
                recordBean.setEducation(resultSet.getInt("education"));
                recordBean.setDegree(resultSet.getInt("degree"));
                recordBean.setEducation_school(resultSet.getString("education_school"));
                recordBean.setDegree_school(resultSet.getString("degree_school"));
                recordBean.setPosition(resultSet.getInt("position"));
                recordBean.setDepartment(resultSet.getInt("department"));
                recordBean.setPhone(resultSet.getString("phone"));
                recordBean.setIs_authorized(resultSet.getInt("is_authorized"));
                recordBean.setProfession_title(resultSet.getInt("profession_title"));
                recordBean.setId_number(resultSet.getString("id_number"));
                recordBean.setPic(resultSet.getString("pic"));
                recordBean.setNationality(resultSet.getInt("nationality"));
                recordBean.setBirth(resultSet.getDate("birth"));
                recordBean.setToWork(resultSet.getDate("towork"));
                recordBean.setAddress(resultSet.getString("address"));
                recordBean.setMarried(resultSet.getInt("married"));
                recordBean.setMajor(resultSet.getString("major"));
                recordBean.setEducationexp(resultSet.getString("educationexp"));
                return recordBean;
            }
        },id);
        return recordBean ;
    }


    @Override
    public int delById(Integer staffid) {
        String sql="delete from staff_record where id=?";
        return jdbcOperations.update(sql,staffid);
    }
}
