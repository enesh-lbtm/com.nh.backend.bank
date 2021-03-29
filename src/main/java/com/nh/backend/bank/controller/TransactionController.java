package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Transaction;
import com.nh.backend.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public final class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping("transaction")
    public ResponseEntity<String> id(@RequestBody Transaction transaction) {
          return ResponseEntity.ok("hello nh");
    }
}

