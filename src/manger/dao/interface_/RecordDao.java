package manger.dao.interface_;

import manger.bean.RecordBean;
import manger.bean.RecordBean_;
import manger.bean.RecordDictRawBean;

import java.util.List;

public interface RecordDao {
    public int recordAdd(RecordBean recordBean);
    public List<RecordDictRawBean> recordDictSel();
    public  List<RecordBean> recordSelByName(String name);
    public int recordUpdateById(RecordBean bean);
    public int getIdByName(String name);
    public int updateSubject(Integer suid, Integer staffid);
    public int delSubjectByStaff(Integer staffid);
    public RecordBean getRecordBeanById(int id);
    public int delById(Integer staffid);
    public List<RecordBean> recordSel();
}
