package manger.dao.interface_;

import manger.bean.ContractBean;

import java.util.List;

public interface ContractDao {
    public int contractAdd(String location,String  comment);
    public List<ContractBean> getContract();
}
