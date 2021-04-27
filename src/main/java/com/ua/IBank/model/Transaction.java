package com.ua.IBank.model;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private Integer accountNumberOfRecipient;
    private Integer amountOfMoney;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    public Transaction() {
    }

    public Transaction(Integer accountNumberOfRecipient, Integer amountOfMoney, Account account) {
        this.accountNumberOfRecipient = accountNumberOfRecipient;
        this.amountOfMoney = amountOfMoney;
        this.account = account;
    }

    public Transaction(Integer id, Integer accountNumberOfRecipient, Integer amountOfMoney, Account account) {
        this.id = id;
        this.accountNumberOfRecipient = accountNumberOfRecipient;
        this.amountOfMoney = amountOfMoney;
        this.account = account;
    }

    public Transaction(Transaction transaction){
        this.accountNumberOfRecipient = transaction.accountNumberOfRecipient;
        this.amountOfMoney = transaction.amountOfMoney;
        this.account = transaction.account;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAccountNumberOfRecipient() {
        return accountNumberOfRecipient;
    }

    public Integer getAmountOfMoney() {
        return amountOfMoney;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccountNumberOfRecipient(Integer accountNumberOfRecipient) {
        this.accountNumberOfRecipient = accountNumberOfRecipient;
    }

    public void setAmountOfMoney(Integer amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", accountNumberOfRecipient=" + accountNumberOfRecipient +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
