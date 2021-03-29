package com.nh.backend.bank.controller;

import com.nh.backend.bank.entity.Account;
import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.service.AccountService;
import com.nh.backend.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/")
public final class UsersController {

    @Autowired
    private UserService service;

    @PostMapping("login")
    public ResponseEntity<Users> login(@RequestBody Users user) {
        Users users = service.login(user);
        if (users != null) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("register")
    public ResponseEntity<Users> register(@RequestBody Users user) {
        Users users = service.register(user);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
