package manger.service.interface_;

import manger.bean.UserBean;

public interface UserService {
    public int addUser(UserBean userBean);
    public int userLogin(UserBean userBean);
    public UserBean getUserByJ_number(Integer J_number);
    public int updateUserBeanById(UserBean userBean);
}
