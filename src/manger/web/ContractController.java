package manger.web;

import manger.bean.ContractBean;
import manger.service.interface_.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Controller
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;
    @RequestMapping(value = "/toContractAdd")
    public String toContractAdd(){
        return "contractAdd";
    }

    @RequestMapping(value = "/contractAdd")
    public String contractAdd(MultipartFile file, String comment, Model model){
        if(file!=null){
            try {
                file.transferTo(new File("/data/files/" + file.getOriginalFilename()));
                model.addAttribute("message","上传成功");
            } catch (Exception e) {
                 model.addAttribute("message","上传失败 ");
                e.printStackTrace();
            }
        }
        String filePath =  "/data/files/" + file.getOriginalFilename();
        System.out.println(filePath);
        contractService.contractAdd(filePath,comment);
        return "contractAdd";
    }
@RequestMapping(value = "getContract")
    public @ResponseBody
    List<ContractBean> getContract(){
        List<ContractBean> contractBeanList=contractService.getContract();
        return  contractBeanList;
    }
    @RequestMapping(value = "toContract")
    public String toContract(Model model){
        List<ContractBean> contractBeanList=contractService.getContract();
        model.addAttribute("contractList",contractBeanList);
        return  "contract";
    }

}

