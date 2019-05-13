package manger.service.interface_;

import manger.bean.SalaryBean;

import java.util.List;

public interface SalaryService {
    public int salaryAdd(SalaryBean salaryBean);
    public SalaryBean getSalaryByName(String name);
    public List<SalaryBean> getSalary();
}
