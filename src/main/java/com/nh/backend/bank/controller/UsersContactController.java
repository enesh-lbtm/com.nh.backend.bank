package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Transaction;
import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.service.TransactionService;
import com.nh.backend.bank.service.UsersContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public final class UsersContactController  {

    @Autowired
    private UsersContactService service;

    @GetMapping("usersContact")
    public ResponseEntity<String> id(@RequestBody Users users) {
          return ResponseEntity.ok("hello nh");
    }
}


