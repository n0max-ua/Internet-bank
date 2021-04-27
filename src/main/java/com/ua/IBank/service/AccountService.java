package com.ua.IBank.service;

import com.ua.IBank.model.Account;
import com.ua.IBank.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;

    public void save(Account account){
        accountRepo.save(account);
    }
}
