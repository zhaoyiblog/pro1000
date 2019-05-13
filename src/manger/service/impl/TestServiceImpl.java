package manger.service.impl;

import manger.bean.Test;
import manger.dao.interface_.TestDao;
import manger.service.interface_.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public Test test() {
        return testDao.test();
    }
}
