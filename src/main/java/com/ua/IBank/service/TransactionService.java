package com.ua.IBank.service;

import com.ua.IBank.model.Transaction;
import com.ua.IBank.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;

    public void save(Transaction transaction){
        transactionRepo.save(transaction);
    }
}
