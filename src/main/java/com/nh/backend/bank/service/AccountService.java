package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Account;
import com.nh.backend.bank.entity.Address;
import com.nh.backend.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    public Account read(Long id) {
        Optional<Account> account = repository.findById(id);
        return account.orElse(null);
    }

    public Account create(Account account) {
        return repository.save(account);
    }

    public Account update(Account account) {
        return repository.save(account);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Account> readAll() {
        return repository.findAll();
    }
}
