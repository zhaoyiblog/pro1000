package manger.web;

import manger.bean.PerformanceBean;
import manger.service.interface_.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/performance")
public class PerformanceController {
    @Autowired
    private PerformanceService performanceService;
    @RequestMapping(value = "/getPerformanceByName")
    public @ResponseBody List<PerformanceBean> getPerformanceByName(String name){
        return  performanceService.getPerforamanceByName(name);
    }
    @RequestMapping(value = "/toPerformance")
    public String toPerformance(){
        return "performance";
    }
    @RequestMapping(value = "/toPerformanceAdd")
    public String toPerformanceAdd(){
        return "performanceAdd";
    }
    @RequestMapping(value = "/performanceAdd")
    public String performanceAdd(PerformanceBean performanceBean, Integer id, Model model){
        System.out.println(performanceBean);
        System.out.println(id);
        performanceService.performanceAdd(performanceBean,id);
        model.addAttribute("message","添加成功");
        return "performanceAdd";
    }
}
