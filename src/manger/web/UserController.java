package manger.web;

import manger.bean.UserBean;
import manger.service.interface_.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param userBean
     * @param model
     * @return
     */
    @RequestMapping(value = "/register")
    public String UserRegister(UserBean userBean, Model model){
        int ref= userService.addUser(userBean);
        if(ref>0){

            model.addAttribute("message","注册成功,请登录");
        }
        else{
            model.addAttribute("message","注册失败，请重新尝试");
        }
        return "register";
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping(value = "login")
    public String UserLogin(UserBean userBean, Model model, HttpSession session){
        int count=userService.userLogin(userBean);
        if(count<1){
            model.addAttribute("message","用户名或密码错误，请重新登录");
            return "login";
        }else {
            UserBean userBean1=userService.getUserByJ_number(userBean.getJ_number());
            System.out.println(userBean1.getName());
            System.out.println(userBean1);
            session.setAttribute("user",userBean1);
            session.setAttribute("name",userBean1.getName());
            return "index";
        }
    }
    @RequestMapping(value = "/toR")
    public String toRegister(){
        return "register";
    }
    @RequestMapping(value = "/toL")
    public String toLogin(){
        return "login";
    }

    /**
     * 指向Myinfo页面
     * @return
     */
    @RequestMapping(value = "/toMyinfo")
    public String toMyinfo(HttpSession session,Model model){
        return "myinfo";
    }
    @RequestMapping(value = "/updateUser")
    public String updateUser(String ypassword,String password,String confrim_password,HttpSession session,Model model){
        UserBean temp= (UserBean) session.getAttribute("user");
        UserBean userBean = new UserBean();
        userBean.setId(temp.getId());
        userBean.setName(temp.getName());
        System.out.println("原密码"+temp.getPassword());
        if(temp.getPassword().equals(ypassword)){
            userBean.setPassword(password);
            int ref=userService.updateUserBeanById(userBean);
            if(ref>0){
                session.setAttribute("user",userBean);
                model.addAttribute("message","您已成功修改");
            }else {
                model.addAttribute("message","修改失败");
            }
            return "myinfo";

        }else {
            model.addAttribute("message","原密码输入错误");
            return "myinfo";
        }



    }

    @RequestMapping(value = "/uploadPic")
    public String testPic(@RequestParam("file") MultipartFile image, Model model){
        System.out.println(image.getName());
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
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "logout";
    }
}
