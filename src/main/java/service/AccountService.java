package service;

import pojo.po.Account;

public interface AccountService {
    /**
     * 通过比对number和password，查找是否存在该用户
     * @param number
     * @param password
     * @return 存在返回account,否则返回nll
     */
    Account checkAccount(String number, String password);
}
