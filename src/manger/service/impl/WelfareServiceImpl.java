package manger.service.impl;

import manger.bean.WelfareBean;
import manger.dao.interface_.WelfareDao;
import manger.service.interface_.WelfareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.WatchService;
@Service
public class WelfareServiceImpl implements WelfareService {
    @Autowired
    private WelfareDao welfareDao;
    @Override
    public int addWelfare(WelfareBean welfareBean) {
        return welfareDao.addWelfare(welfareBean);
    }


    @Override
    public WelfareBean getWelfareByName(String name) {
        return welfareDao.getWelfareByName(name);
    }
}
