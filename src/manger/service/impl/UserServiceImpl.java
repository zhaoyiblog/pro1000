package manger.service.impl;

import manger.bean.UserBean;
import manger.dao.interface_.UserDao;
import manger.service.interface_.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int addUser(UserBean userBean) {

        return userDao.addUser(userBean);
    }

    @Override
    public int userLogin(UserBean userBean) {
        return userDao.userLogin(userBean);
    }

    @Override
    public UserBean getUserByJ_number(Integer J_number) {
        return userDao.getUserByJ_number(J_number);
    }

    @Override
    public int updateUserBeanById(UserBean userBean) {
        return userDao.updateUserBeanById(userBean);
    }
}
