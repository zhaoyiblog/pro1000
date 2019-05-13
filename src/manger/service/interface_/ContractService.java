package manger.service.interface_;

import manger.bean.ContractBean;

import java.util.List;

public interface ContractService {
    public int contractAdd(String location,String  comment);
    public List<ContractBean> getContract();
}
