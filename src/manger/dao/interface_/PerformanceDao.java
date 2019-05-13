package manger.dao.interface_;

import manger.bean.PerformanceBean;

import java.util.List;

public interface PerformanceDao {
    public List<PerformanceBean> getPerforamanceByName(String name);
    public int performanceAdd(PerformanceBean performanceBean,Integer id);
}
