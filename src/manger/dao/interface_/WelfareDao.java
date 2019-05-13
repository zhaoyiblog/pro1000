package manger.dao.interface_;

import manger.bean.WelfareBean;

public interface WelfareDao {
    public int addWelfare(WelfareBean welfareBean);
    public WelfareBean getWelfareByName(String name);
}
