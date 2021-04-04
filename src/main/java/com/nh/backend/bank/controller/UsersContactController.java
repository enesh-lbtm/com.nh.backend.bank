package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Transaction;
import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.entity.UsersContact;
import com.nh.backend.bank.service.TransactionService;
import com.nh.backend.bank.service.UsersContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/userContract/")
public final class UsersContactController  {

    @Autowired
    private UsersContactService service;

    @PostMapping("create")
    public ResponseEntity<UsersContact> create(@RequestBody UsersContact usersContact) {
        UsersContact res = service.create(usersContact);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("read/{id:.+}")
    public ResponseEntity<UsersContact> create(@PathVariable("id") Long id) {
        UsersContact res = service.read(id);
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<UsersContact> update(@RequestBody UsersContact usersContact){
        UsersContact res = service.update(usersContact);
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id:.+}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


