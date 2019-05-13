package manger.service.impl;

import manger.bean.RecordBean;
import manger.bean.RecordBean_;
import manger.bean.RecordDictBean;
import manger.bean.RecordDictRawBean;
import manger.dao.interface_.RecordDao;
import manger.service.interface_.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;
    @Override
    public int recordAdd(RecordBean recordBean) {
        return recordDao.recordAdd(recordBean);
    }

    @Override
    public RecordDictBean recordDictSel() {
        List<RecordDictRawBean> recordDictRawBeanList= new ArrayList<>();
        recordDictRawBeanList=recordDao.recordDictSel();
        RecordDictBean recordDictBean= new RecordDictBean();
        List<String> sexList= new ArrayList<>();
        List<String> nationList= new ArrayList<>();
        List<String> politic_statusList= new ArrayList<>();
        List<String> profession_titleList= new ArrayList<>();
        List<String> educationList= new ArrayList<>();
        List<String> degreeList= new ArrayList<>();
        List<String> positionList= new ArrayList<>();
        List<String> departmentList= new ArrayList<>();
        List<String> is_atuthrozidList= new ArrayList<>();
        List<String> nationalityList= new ArrayList<>();
        List<String> marriedList= new ArrayList<>();
        List<String> subjectList= new ArrayList<>();
        for (RecordDictRawBean bean:
             recordDictRawBeanList) {
            if ("sex".equals(bean.getType())){
                sexList.add(bean.getAttribute());
            }
            else if("nation".equals(bean.getType())){
                nationList.add(bean.getAttribute());
            }
            else if("politic_status".equals(bean.getType())){
                politic_statusList.add(bean.getAttribute());
            }
            else if("profession_title".equals(bean.getType())){
                profession_titleList.add(bean.getAttribute());
            }
            else if("education".equals(bean.getType())){
                educationList.add(bean.getAttribute());
            }
            else if("degree".equals(bean.getType())){
                degreeList.add(bean.getAttribute());
            }
            else if("position".equals(bean.getType())){
                positionList.add(bean.getAttribute());
            }
            else if("department".equals(bean.getType())){
                departmentList.add(bean.getAttribute());
            }
            else if("is_atuthrozid".equals(bean.getType())){
                is_atuthrozidList.add(bean.getAttribute());
            }
            else if("nationality".equals(bean.getType())){
                nationalityList.add(bean.getAttribute());
            }
            else if("married".equals(bean.getType())){
                marriedList.add(bean.getAttribute());
            }
            else if("subject".equals(bean.getType())){
                subjectList.add(bean.getAttribute());
            }

            recordDictBean.setSexList(sexList);
            recordDictBean.setDegreeList(degreeList);
            recordDictBean.setDeparmentList(departmentList);
            recordDictBean.setEducationList(educationList);
            recordDictBean.setIsAuthroziedList(is_atuthrozidList);
            recordDictBean.setNationList(nationList);
            recordDictBean.setPoliticsList(politic_statusList);
            recordDictBean.setPositionList(positionList);
            recordDictBean.setTitleList(profession_titleList);
            recordDictBean.setNationalityList(nationalityList);
            recordDictBean.setMarriedList(marriedList);
            recordDictBean.setSubjectList(subjectList);
        }
        return recordDictBean;
    }

    @Override
    public List<RecordBean> recordselByName(String name) {
        return recordDao.recordSelByName(name);
    }

    /**
     *由数字转换为文字
     * @param name
     * @return
     */
    @Override
    public List<RecordBean_> recordUnionByName(String name) {
        List<RecordBean> recordBeans=this.recordselByName(name);
        RecordDictBean recordDictBean=this.recordDictSel();
        List<RecordBean_>  recordBean_s=new ArrayList<>();
        System.out.println(recordBeans);
        System.out.println(recordDictBean);
        for (RecordBean recordBean:
                recordBeans) {
            RecordBean_ recordBean_= new RecordBean_();
            recordBean_.setDegree(recordDictBean.getDegreeList().get(recordBean.getDegree()-1));
            recordBean_.setDegree_school(recordBean.getDegree_school());
            recordBean_.setId(recordBean.getId());
            recordBean_.setSex(recordDictBean.getSexList().get(recordBean.getSex()-1));
            recordBean_.setName(recordBean.getName());
            recordBean_.setNation(recordDictBean.getNationList().get(recordBean.getNation()-1));
            recordBean_.setDepartment(recordDictBean.getDeparmentList().get(recordBean.getDepartment()-1));
            recordBean_.setEducation(recordDictBean.getEducationList().get(recordBean.getEducation()-1));
            recordBean_.setEducation_school(recordBean.getEducation_school());
            recordBean_.setIs_authorized(recordDictBean.getIsAuthroziedList().get(recordBean.getIs_authorized()-1));
            recordBean_.setPhone(recordBean.getPhone());
            recordBean_.setPolitics_status(recordDictBean.getPoliticsList().get(recordBean.getPolitics_status()-1));
            recordBean_.setPosition(recordDictBean.getPositionList().get(recordBean.getPosition()-1));
            recordBean_.setProfession_title(recordDictBean.getTitleList().get(recordBean.getProfession_title()-1));

            recordBean_.setId_number(recordBean.getId_number());
            recordBean_.setPic(recordBean.getPic());
            recordBean_.setNationality(recordDictBean.getNationalityList().get(recordBean.getNationality()-1));
            recordBean_.setBirth(recordBean.getBirth());
            recordBean_.setAddress(recordBean.getAddress());
            recordBean_.setMarried(recordDictBean.getMarriedList().get(recordBean.getMarried()-1));
            recordBean_.setMajor(recordBean.getMajor());
            recordBean_.setTowork(recordBean.getToWork());
            recordBean_.setEducationexp(recordBean.getEducationexp());
            recordBean_s.add(recordBean_);

        }
        return recordBean_s;
    }

    @Override
    public List<RecordBean_> recordUnionByName( ) {
        List<RecordBean> recordBeans=this.recordSel();
        RecordDictBean recordDictBean=this.recordDictSel();
        List<RecordBean_>  recordBean_s=new ArrayList<>();
        System.out.println(recordBeans);
        System.out.println(recordDictBean);
        for (RecordBean recordBean:
                recordBeans) {
            RecordBean_ recordBean_= new RecordBean_();
            recordBean_.setDegree(recordDictBean.getDegreeList().get(recordBean.getDegree()-1));
            recordBean_.setDegree_school(recordBean.getDegree_school());
            recordBean_.setId(recordBean.getId());
            recordBean_.setSex(recordDictBean.getSexList().get(recordBean.getSex()-1));
            recordBean_.setName(recordBean.getName());
            recordBean_.setNation(recordDictBean.getNationList().get(recordBean.getNation()-1));
            recordBean_.setDepartment(recordDictBean.getDeparmentList().get(recordBean.getDepartment()-1));
            recordBean_.setEducation(recordDictBean.getEducationList().get(recordBean.getEducation()-1));
            recordBean_.setEducation_school(recordBean.getEducation_school());
            recordBean_.setIs_authorized(recordDictBean.getIsAuthroziedList().get(recordBean.getIs_authorized()-1));
            recordBean_.setPhone(recordBean.getPhone());
            recordBean_.setPolitics_status(recordDictBean.getPoliticsList().get(recordBean.getPolitics_status()-1));
            recordBean_.setPosition(recordDictBean.getPositionList().get(recordBean.getPosition()-1));
            recordBean_.setProfession_title(recordDictBean.getTitleList().get(recordBean.getProfession_title()-1));

            recordBean_.setId_number(recordBean.getId_number());
            recordBean_.setPic(recordBean.getPic());
            recordBean_.setNationality(recordDictBean.getNationalityList().get(recordBean.getNationality()-1));
            recordBean_.setBirth(recordBean.getBirth());
            recordBean_.setAddress(recordBean.getAddress());
            recordBean_.setMarried(recordDictBean.getMarriedList().get(recordBean.getMarried()-1));
            recordBean_.setMajor(recordBean.getMajor());
            recordBean_.setTowork(recordBean.getToWork());
            recordBean_.setEducationexp(recordBean.getEducationexp());
            recordBean_s.add(recordBean_);

        }
        return recordBean_s;
    }

    @Override
    public int recordUpdateById(RecordBean recordBean) {
        return recordDao.recordUpdateById(recordBean);
    }

    @Override
    public int getIdByName(String name) {
        return recordDao.getIdByName(name);
    }

    @Override
    public int updateSubject(Integer suid, Integer staffid) {
        return recordDao.updateSubject(suid, staffid);
    }

    @Override
    public int delSubjectByStaff(Integer staffid) {
        return recordDao.delSubjectByStaff(staffid);
    }

    @Override
    public RecordBean getRecordBeanById(int id) {
        return recordDao.getRecordBeanById(id);
    }

    @Override
    public int delById(Integer staffid) {
        return recordDao.delById(staffid);
    }

    @Override
    public List<RecordBean> recordSel() {
        return recordDao.recordSel();
    }
}
