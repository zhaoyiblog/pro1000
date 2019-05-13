package manger.service.impl;

import manger.dao.interface_.SubjectDao;
import manger.service.interface_.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectDao subjectDao;
    @Override
    public List<Integer> getSubList(Integer staffid) {
        return subjectDao.getSubList(staffid);
    }
}
