package dao.impl;

import com.zz.core.SqlSession;
import com.zz.core.SqlSessionFactory;
import com.zz.core.SqlSessionFactoryBuilder;
import com.zz.utils.Resources;
import dao.UserDao;
import pojo.po.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl() {
        InputStream input = Resources.getResourceAsStream("easydao-config.xml");
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User selectUserById(int userId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUserId(userId);
        List<Object> objectList = sqlSession.selectList("UserMapper.selectUserById", user);
        sqlSession.close();
        return objectList.size() == 0 ? null : (User) objectList.get(0);
    }
}
