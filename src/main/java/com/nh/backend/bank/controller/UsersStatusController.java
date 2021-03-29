package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.entity.UsersStatus;
import com.nh.backend.bank.service.UsersStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public final class UsersStatusController {

    @Autowired
    private UsersStatusService service;

    @GetMapping("usersStatus")
    public ResponseEntity<UsersStatus> create(@RequestBody UsersStatus usersStatus) {
        return new ResponseEntity(HttpStatus.OK);
    }
}
