package manger.service.impl;

import manger.bean.PerformanceBean;
import manger.dao.interface_.PerformanceDao;
import manger.service.interface_.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PerformanceServiceImpl implements PerformanceService {
    @Autowired
    private PerformanceDao performanceDao;
    @Override
    public List<PerformanceBean> getPerforamanceByName(String name) {
        return performanceDao.getPerforamanceByName(name);
    }

    @Override
    public int performanceAdd(PerformanceBean performanceBean, Integer id) {
        return performanceDao.performanceAdd(performanceBean,id);
    }
}
