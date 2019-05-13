package manger.web;

import manger.bean.SalaryBean;
import manger.service.interface_.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/salary")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;
    @RequestMapping(value = "/toSalary")
    public String toSalary(Model model){
        List<SalaryBean> salaryBeans=salaryService.getSalary();
        for (SalaryBean salaryBean:salaryBeans
             ) {
            salaryBean.setCount(salaryBean.getBase()+salaryBean.getTech_year()*100+salaryBean.getClass_number()*(30+salaryBean.getTech_year()*10)+salaryBean.getAllowance());
        }
        model.addAttribute("bean",salaryBeans);
        return "salary";
    }
    @RequestMapping(value = "/toSalaryAdd")
    public String toSalaryAdd(){
        return "salaryAdd";
    }
    @RequestMapping(value = "/salaryAdd")
    public String salaryAdd(SalaryBean salaryBean, Model model){
        System.out.println(salaryBean);
        int ref =salaryService.salaryAdd(salaryBean);
        model.addAttribute("message","添加成功");
        return "salaryAdd";
    }
    @RequestMapping(value = "/getSalaryByName")
    public @ResponseBody SalaryBean getSalaryByName(String name){
        SalaryBean salaryBean=salaryService.getSalaryByName(name);
        return  salaryBean;
    }
}
