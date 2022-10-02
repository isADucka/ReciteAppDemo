package dao;

import pojo.po.User;

public interface UserDao {
    /**
     * 通过用户id获取该用户
     * @param userId 需要查找的用户id
     * @return 存在则返回该用户pojo，不存在返回null
     */
    User selectUserById(int userId);

}
