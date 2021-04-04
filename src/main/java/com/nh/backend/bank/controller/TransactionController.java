package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Transaction;
import com.nh.backend.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction/")
public final class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping("create")
    public ResponseEntity<Transaction> create(@RequestBody Transaction transaction) {
        Transaction res = service.create(transaction);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @GetMapping("read/{id:.+}")
    public ResponseEntity<Transaction> read(@PathVariable("id") Long id){
        Transaction res = service.read(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PutMapping("update")
public  ResponseEntity<Transaction> update(@RequestBody Transaction transaction){
        Transaction res = service.update(transaction);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @DeleteMapping("delete/{id:.+}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

