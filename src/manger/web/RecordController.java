package manger.web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import manger.bean.RecordBean;
import manger.bean.RecordBean_;
import manger.bean.RecordDictBean;
import manger.service.interface_.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    /**
     * JavaBean与参数绑定时需要注意输入值规格是否符和参数类型，否则会绑定失败
     * @param recordBean
     * @param model
     * @return
     */
    @RequestMapping(value = "/add")
    public String recordAdd(RecordBean recordBean, MultipartFile image, Model model) {
        try {
            image.transferTo(new File("/data/images/" + image.getOriginalFilename()));
//            model.addAttribute("message","上传成功");
        } catch (Exception e) {
//            model.addAttribute("message","上传失败 ");
            e.printStackTrace();
        }
        System.out.println(recordBean);
        String imagePath = "/data/images" + image.getOriginalFilename();
        recordBean.setPic(imagePath);
        int ref = recordService.recordAdd(recordBean);
        System.out.println(ref);
        if (ref >= 1) {
            model.addAttribute("message", "您已成功添加记录");
            int id = recordService.getIdByName(recordBean.getName());
            recordService.delSubjectByStaff(id);
            for (int i = 0; i < recordBean.getSubject().length; i++) {
                recordService.updateSubject(recordBean.getSubject()[i], id);
            }
        } else {
            model.addAttribute("message", "添加失败，请重新添加");
        }

        return "forward:/record/toRecordAdd";
    }

    @RequestMapping(value = "toRecord")
    public String toRecord(Model model){
        ;
        return "recordSel";
    }
    @RequestMapping(value = "toRecordAdd")
    public String toRecordAdd(Model model){
        RecordDictBean recordDictBean=recordService.recordDictSel();
        model.addAttribute("recordDictBean",recordDictBean);
        return "recordAdd";
    }
    @RequestMapping(value = "toRecordUpdate")
    public String toRecordUpdate(Model model){
        RecordDictBean recordDictBean=recordService.recordDictSel();
        model.addAttribute("recordDictBean",recordDictBean);
        return "recordUpdate";
    }

    @RequestMapping(value ="recordselByname" )
    public @ResponseBody List<RecordBean_> recordselByname(String name){
        System.out.println(name);
        List<RecordBean_> recordBeanList= new ArrayList<>()  ;
        recordBeanList=recordService.recordUnionByName(name);
        System.out.println("*******");
        System.out.println(recordBeanList.get(0));
        return recordBeanList;
    }
    @RequestMapping(value = "updateById")
    public String updateById(RecordBean recordBean,Model model){
        int ref = recordService.recordUpdateById(recordBean);
        if(ref>0){
            model.addAttribute("message","您已成功修改");
        }
        else{
            model.addAttribute("message","修改失败，请重新修改");
        }
        return "forward:/record/toRecordUpdate";
    }
    @RequestMapping(value = "toRecordSel")
    public String toRecordSel(Model model){
        RecordDictBean recordDictBean=recordService.recordDictSel();
        model.addAttribute("recordDictBean",recordDictBean);

        List<RecordBean_> recordBean_s=recordService.recordUnionByName();
        System.out.println(recordBean_s);
        model.addAttribute("bean",recordBean_s);
        return "recordSel";
    }
    @RequestMapping(value = "test")
    public String test(){
        return "recordUpdate000";
    }
    @RequestMapping(value = "getRecordBeanById")
    public @ResponseBody RecordBean getRecordBeanById(int id){
        RecordBean recordBean=recordService.getRecordBeanById(id);
        return recordBean;
    }
    @RequestMapping(value = "toRecordDel")
    public String todel(){
        return  "recordDel";
    }
    @RequestMapping(value = "delById")
    public String delById(Integer staffId, Model model){
        int ref = recordService.delById(staffId);
        if(ref>0){
            model.addAttribute("message","删除成功");
        }else {
            model.addAttribute("message","删除失败");
        }
        return "recordDel";
    }


//    @RequestMapping(value = "recordAdd")
//    public String RecordAdd( String name,int sex,int nation,int politics_status,int profession_title,
//                             int education, int degree,String education_school,String  degree_school,String phone,
//                             int position,int department,int is_authorized){
//        System.out.println(name);
//        System.out.println(degree);
//        System.out.println(department);
////        System.out.println(recordBean.getName());
////        System.out.println(recordBean.getSex());
////        int ref=recordService.recordAdd(recordBean);
////        if(ref>0){
////            model.addAttribute("message","您已成功添加");
////        }
////        else{
////            model.addAttribute("message","添加失败，请重新添加");
////        }
//        return "recordAdd";
//    }
}
