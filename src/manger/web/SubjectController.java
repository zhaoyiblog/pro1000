package manger.web;

import manger.bean.SubjectBean;
import manger.service.interface_.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @RequestMapping(value = "/getsuids")
    public @ResponseBody
    List<Integer> getSubById(Integer staffid){
        return subjectService.getSubList(staffid);
    }
}
