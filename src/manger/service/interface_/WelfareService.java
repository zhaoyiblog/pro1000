package manger.service.interface_;

import manger.bean.WelfareBean;

public interface WelfareService {
    public int addWelfare(WelfareBean welfareBean);
    public WelfareBean getWelfareByName(String name);
}
