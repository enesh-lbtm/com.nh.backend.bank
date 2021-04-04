package com.nh.backend.bank.controller;

import com.nh.backend.bank.entity.Account;
import com.nh.backend.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/account/")
public final class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping("create")
    public ResponseEntity<Account> create(@RequestBody Account account) {
        Account res = service.create(account);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("read")
    public ResponseEntity<List<Account>> read() {
        List<Account> res = service.readAll();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("read/{id:.+}")
    public ResponseEntity<Account> read(@PathVariable("id") Long id) {
        Account res = service.read(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<Account> update(@RequestBody Account account) {
        Account res = service.update(account);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id:.+}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
