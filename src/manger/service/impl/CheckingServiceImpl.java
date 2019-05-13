package manger.service.impl;

import manger.bean.CheckingBean;
import manger.dao.interface_.CheckingDao;
import manger.service.interface_.CheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckingServiceImpl implements CheckingService {
    @Autowired
    private CheckingDao checkingDao;
    @Override
    public CheckingBean selCheck(int year, int month, String name) {
        return checkingDao.selCheck(year,month,name);
    }

    @Override
    public int checkAdd(CheckingBean checkingBean) {
        return checkingDao.checkAdd(checkingBean);
    }

    @Override
    public List<CheckingBean> selCheck() {
        return checkingDao.selCheck();
    }
}
