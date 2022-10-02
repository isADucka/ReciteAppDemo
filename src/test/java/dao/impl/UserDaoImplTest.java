package dao.impl;

import dao.UserDao;
import org.junit.Test;
import pojo.po.User;

public class UserDaoImplTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void testSelectUserById(){
        int userId = 1;
        User user = userDao.selectUserById(userId);
        System.out.println(user);
    }
}
