package com.nh.backend.bank.service;


import com.nh.backend.bank.entity.Transaction;
import com.nh.backend.bank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService   {

    @Autowired
    private TransactionRepository repository;



    public void read(Long id) {

    }
    public void create(Transaction transaction) {

    }
    public void update(Transaction transaction ) {

    }
    public void delete(Long id) {

    }

}



