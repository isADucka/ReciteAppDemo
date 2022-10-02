package service.impl;

import pojo.po.Account;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountService accountService=new AccountServiceImpl();

    @Override
    public Account checkAccount(String number, String password) {
        Account account = accountService.checkAccount(number, password);
        return account;
    }
}
