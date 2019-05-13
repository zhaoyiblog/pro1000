package manger.service.impl;

import manger.bean.SalaryBean;
import manger.dao.interface_.SalaryDao;
import manger.service.interface_.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryDao salaryDao;
    @Override
    public int salaryAdd(SalaryBean salaryBean) {
        return salaryDao.salaryAdd(salaryBean);
    }

    @Override
    public SalaryBean getSalaryByName(String name) {
        return salaryDao.getSalaryByName(name);
    }

    @Override
    public List<SalaryBean> getSalary() {
        return salaryDao.getSalary();
    }
}
