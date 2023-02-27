package com.project.ey.bluepy.onlinePayment.services.impl;

import com.project.ey.bluepy.onlinePayment.entities.Account;
import com.project.ey.bluepy.onlinePayment.repositories.AccountRepository;
import com.project.ey.bluepy.onlinePayment.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account findAccountByNumber(Long accountNumber) {
        return accountRepository.findAccountByAccountNumber(accountNumber);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
