package manger.service.impl;

import manger.bean.ContractBean;
import manger.dao.interface_.ContractDao;
import manger.service.interface_.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractDao contractDao;
    @Override
    public int contractAdd(String location, String comment) {
        return contractDao.contractAdd(location,comment);
    }

    @Override
    public List<ContractBean> getContract() {
        return contractDao.getContract();
    }
}
