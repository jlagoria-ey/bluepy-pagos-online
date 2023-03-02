package com.project.ey.bluepy.onlinePayment.controller;

import com.project.ey.bluepy.onlinePayment.entities.Account;
import com.project.ey.bluepy.onlinePayment.entities.Company;
import com.project.ey.bluepy.onlinePayment.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping(path = "accountList",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Account>> saveListAccount(@RequestBody List<Account> accounts) throws ServerException {

        List<Account> accountSaved = accountService.saveall(accounts);

        if (accountSaved == null) {
            throw new ServerException("Error de datos");
        } else {
            return new ResponseEntity<>(accountSaved, HttpStatus.CREATED);
        }
    }
}
