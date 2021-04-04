package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.entity.UsersDocument;
import com.nh.backend.bank.service.UsersDocumentService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usersDocument/")
public final class UsersDocumentController {

    @Autowired
    private UsersDocumentService service;

    @PostMapping("create")
    public ResponseEntity<UsersDocument> create(@RequestBody UsersDocument usersDocument) {
        UsersDocument res= service.create(usersDocument);
        return new ResponseEntity<>(res, HttpStatus.OK);

    }
    @GetMapping("read")
    public  ResponseEntity<List<UsersDocument>> read(){
        List<UsersDocument> res = service.readAll();
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("read/{id:.+}")
    public ResponseEntity<UsersDocument> read(@PathVariable("id") Long id){
        UsersDocument res = service.read(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PutMapping("update")
    public ResponseEntity<UsersDocument> update(@RequestBody UsersDocument usersDocument){
        UsersDocument res = service.update(usersDocument);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @DeleteMapping("delete/{id:.+}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

