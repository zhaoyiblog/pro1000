package manger.web;

import manger.bean.Test;
import manger.service.interface_.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequestMapping(value = "/test")
public class testController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/home")
    public String home(Model model){
        Test test= testService.test();
        model.addAttribute("message",test.getMessage());
        System.out.println(test.getMessage());
        return "home";
    }
 //   @PostMapping("/form")
   @RequestMapping(value = "/uploadPic",method = RequestMethod.POST)
    public String testPic(@RequestParam("file") MultipartFile image, String name,Model model){
        System.out.println(image.getName());
        System.out.println(name);
        System.out.println(image.getContentType());
        try {
            image.transferTo(new File("/data/images/"+image.getOriginalFilename()));
            model.addAttribute("message","上传成功");
        }catch (Exception e){
            model.addAttribute("message","上传失败 ");
            e.printStackTrace();
        }
        return "recordAdd";
    }
    @RequestMapping(value = "/te")
    public String te(String name){
        System.out.println(name);
        return "recordAdd";
    }
}
