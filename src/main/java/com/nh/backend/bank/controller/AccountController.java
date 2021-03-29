package com.nh.backend.bank.controller;

import com.nh.backend.bank.entity.Account;
import com.nh.backend.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/")
public final class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping("")
    public ResponseEntity<String> login(@RequestBody Account account) {
        return ResponseEntity.ok("hello nh");
    }
}
