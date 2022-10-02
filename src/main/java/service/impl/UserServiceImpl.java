package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import pojo.po.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao=new UserDaoImpl();

    //通过userId查找用户
    @Override
    public User selectUserById(int userId) {
        User user = userDao.selectUserById(userId);
        return user;
    }
}
