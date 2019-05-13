package manger.dao.interface_;

import manger.bean.SalaryBean;

import java.util.List;

public interface SalaryDao {
    public int salaryAdd(SalaryBean salaryBean);
    public SalaryBean getSalaryByName(String name);
    public List<SalaryBean> getSalary();
}
