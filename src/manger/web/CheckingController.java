package manger.web;

import manger.bean.CheckingBean;
import manger.service.interface_.CheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/checking")
public class CheckingController {

    @Autowired
    private CheckingService checkingService;
    @RequestMapping(value = "selCheck")
    public@ResponseBody
    CheckingBean selCheck(int year, int month, String name, Model model){
        CheckingBean checkingBean =checkingService.selCheck(year,month,name);
        System.out.println(checkingBean);
        return  checkingBean;
    }
    @RequestMapping(value = "/toCheck")
    public String toCheck(Model model){
        List<CheckingBean> checkingBeans=checkingService.selCheck();
        model.addAttribute("bean",checkingBeans);
        return "check";
    }
    @RequestMapping(value = "/toCheckAdd")
    public String toCheckAdd(){
        return "checkAdd";
    }
    @RequestMapping(value = "/checkAdd")
    public String CheckAdd(CheckingBean checkingBean,Model model){
        checkingService.checkAdd(checkingBean);
        model.addAttribute("message","添加成功");
        return "checkAdd";
    }
}
