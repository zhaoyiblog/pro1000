package manger.service.impl;

import manger.bean.TransferBean;
import manger.service.interface_.TransferDao;
import manger.service.interface_.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferDao transferDao;
    public TransferBean getTransferByNameAndId_number(String name, String id_number){
        return transferDao.getTransferByNameAndId_number(name,id_number);
    }

    @Override
    public int addTransferById(TransferBean transferBean) {
        return transferDao.addTransferById(transferBean);
    }

    @Override
    public List<TransferBean> getTransferByName(String name) {
        return transferDao.getTransferByName(name);
    }
}
