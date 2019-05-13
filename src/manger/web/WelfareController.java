package manger.web;

import manger.bean.WelfareBean;
import manger.service.interface_.WelfareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/welfare")
public class WelfareController {
    @Autowired
    private WelfareService welfareService;
    @RequestMapping("/toWelfareAdd")
    public String toWelfareAdd(){
        return "welfareAdd";
    }

    @RequestMapping("/toWelfare")
    public String toWelfare(){
        return "welfare";
    }
    @RequestMapping("/getWelfareByName")
    public @ResponseBody WelfareBean getWelfareByName(String name){
        WelfareBean welfareBean=welfareService.getWelfareByName(name);
        return  welfareBean;
    }
    @RequestMapping(value = "addWelfare")
    public String addWelfare(WelfareBean welfareBean, Model model){
        welfareService.addWelfare(welfareBean);
        model.addAttribute("message","添加成功");
        return "welfareAdd";
    }
}
