package dao.impl;

import dao.AccountDao;
import org.junit.Test;
import pojo.po.Account;

public class AccountDaoImplTest {
    AccountDao accountDao = new AccountDaoImpl();

    @Test
    public void testCheckAccount(){
        Account account = accountDao.checkAccount("13794673067", "admin");
        System.out.println(account);
    }
}
