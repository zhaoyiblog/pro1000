package manger.web;

import manger.bean.TransferBean;
import manger.service.interface_.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "addTransferBySid")
    public String addTransferBySid(TransferBean transferBean, Model model){
        transferService.addTransferById(transferBean);
        model.addAttribute("message","添加成功");
        return "transferAdd";
    }
    @RequestMapping(value = "getTransferByName")
    public @ResponseBody List<TransferBean> getTransferByName(String name){
        List<TransferBean> transferBeanList=transferService.getTransferByName(name);
        System.out.println(transferBeanList);
        return transferBeanList;
    }
    @RequestMapping(value = "toTransferAdd")
    public String toTransferAdd(){

        return "transferAdd";
    }
    @RequestMapping(value = "toTransfer")
    public String toTransfer(){

        return "transfer";
    }
}
