package manger.dao.interface_;

import manger.bean.CheckingBean;

import java.util.List;

public interface CheckingDao {
    public CheckingBean selCheck(int year,int month,String name);
    public int checkAdd(CheckingBean checkingBean);
    public List<CheckingBean> selCheck();
}
