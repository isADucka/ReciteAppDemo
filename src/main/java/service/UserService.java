package service;

import pojo.po.User;

public interface UserService {

    /**
     * 通过userId查找用户的资料，
     * @param userId
     * @return 如果有这个人，返回User，否则返回null
     */
    User selectUserById(int userId);
}
