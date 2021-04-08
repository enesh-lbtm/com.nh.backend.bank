package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Account;
import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.entity.UsersStatus;
import com.nh.backend.bank.service.UsersStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usersStatus/")
public final class UsersStatusController {

    @Autowired
    private UsersStatusService service;

    @PostMapping("create")
    public ResponseEntity<UsersStatus> create(@RequestBody UsersStatus usersStatus) {
       UsersStatus res = service.create(usersStatus);
        return new ResponseEntity(res, HttpStatus.OK);
    }
    @GetMapping("read")
    public ResponseEntity<List<UsersStatus>> read(){
        List<UsersStatus> res = service.readAll();
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }
    @GetMapping("read/{id:.+}")
    public ResponseEntity<UsersStatus> read(@PathVariable("id") Long id){
        UsersStatus res = service.read(id);
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PutMapping("update")
    public ResponseEntity<UsersStatus> update(@RequestBody UsersStatus usersStatus){
        UsersStatus res = service.update(usersStatus);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @DeleteMapping("delete/{id:.+}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}