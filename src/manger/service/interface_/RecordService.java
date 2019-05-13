package manger.service.interface_;

import manger.bean.RecordBean;
import manger.bean.RecordBean_;
import manger.bean.RecordDictBean;

import java.util.List;

public interface RecordService {
    public int recordAdd(RecordBean recordBean);
    public RecordDictBean recordDictSel();
    public  List<RecordBean> recordselByName(String name);
    public  List<RecordBean_> recordUnionByName(String name);
    public  List<RecordBean_> recordUnionByName();
    public int recordUpdateById(RecordBean recordBean);
    public int getIdByName(String name);
    public int updateSubject(Integer suid,Integer staffid);
    public int delSubjectByStaff(Integer staffid);
    public RecordBean getRecordBeanById(int id);
    public int delById(Integer staffid);
    public List<RecordBean> recordSel();
}
