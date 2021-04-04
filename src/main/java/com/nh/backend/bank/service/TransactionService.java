package com.nh.backend.bank.service;


import com.nh.backend.bank.entity.Transaction;
import com.nh.backend.bank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService   {

    @Autowired
    private TransactionRepository repository;



    public Transaction read(Long id) {
        Optional<Transaction> transaction = repository.findById(id);
        return transaction.orElse(null);
    }
    public Transaction create(Transaction transaction) {
        return  repository.save(transaction);
    }
    public Transaction update(Transaction transaction ) {
        return repository.save(transaction);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }

}



