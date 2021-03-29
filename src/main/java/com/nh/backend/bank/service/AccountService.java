package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Account;
import com.nh.backend.bank.entity.Address;
import com.nh.backend.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    //public void login(Account account) {
    //не уверена что это нужно
    //}
    public void read(Long login) {

    }
    public void create(Account account) {

    }
    public void update(Account account) {

    }
    public void delete(Long login) {

    }
}
