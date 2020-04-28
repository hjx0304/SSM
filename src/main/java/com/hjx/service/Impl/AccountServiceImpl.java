package com.hjx.service.Impl;

import com.hjx.dao.AccountDao;
import com.hjx.entity.Account;
import com.hjx.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public Account login(Account account) {
        return accountDao.login(account);
    }
}
