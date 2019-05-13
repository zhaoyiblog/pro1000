package manger.service.interface_;

import manger.bean.TransferBean;

import java.util.List;

public interface TransferDao {
    public TransferBean getTransferByNameAndId_number(String name,String id_number);
    public int addTransferById(TransferBean transferBean);
    public List<TransferBean> getTransferByName(String name);
}
