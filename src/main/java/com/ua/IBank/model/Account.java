package com.ua.IBank.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private Integer accountNumber;
    private Integer balance;

    @OneToMany(mappedBy = "account")
    private List<Transaction> listOfTransactions;

    public Account() {
    }

    public Account(Integer accountNumber, Integer balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(Integer id, Integer accountNumber, Integer balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(Account account) {
        this.accountNumber = account.accountNumber;
        this.balance = account.balance;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public List<Transaction> getListOfTransactions() {
        return listOfTransactions;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setListOfTransactions(List<Transaction> listOfTransactions) {
        this.listOfTransactions = listOfTransactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
