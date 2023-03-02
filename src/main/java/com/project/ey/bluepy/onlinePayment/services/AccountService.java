package com.project.ey.bluepy.onlinePayment.services;

import com.project.ey.bluepy.onlinePayment.entities.Account;

import java.util.List;

public interface AccountService {
    Account findAccountByNumber(Long accountNumber);
    List<Account> getAllAccounts();
    Account save (Account account);
    List<Account> saveall(List<Account> accounts);
}
