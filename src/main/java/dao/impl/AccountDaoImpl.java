package dao.impl;

import com.zz.core.SqlSession;
import com.zz.core.SqlSessionFactory;
import dao.AccountDao;
import pojo.po.Account;
import utils.DaoUtil;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private final SqlSessionFactory sqlSessionFactory;

    public AccountDaoImpl() {
        this.sqlSessionFactory = DaoUtil.getSqlSessionFactory();
    }

    @Override
    public Account checkAccount(String number, String password) {
        Account src = new Account();
        src.setPassword(password);
        src.setNumber(number);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Object> objectList = sqlSession.selectList("AccountMapper.checkAccount", src);
        return objectList.size() == 0 ? null : (Account) objectList.get(0);
    }
}
