package com.nh.backend.bank.controller;


import com.nh.backend.bank.entity.Contract;
import com.nh.backend.bank.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contract/")
public final class ContractController {

    @Autowired
    private ContractService service;

    @PostMapping("create")
    public ResponseEntity<Contract> create(@RequestBody Contract contract) {
        Contract res = service.create(contract);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @GetMapping("read")
    public ResponseEntity<List<Contract>> read() {
        List<Contract> res = service.readAll();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("read/{id:.+}")
    public ResponseEntity<Contract> read(@PathVariable("id") Long id){
        Contract res = service.read(id);
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PutMapping("update")
    public ResponseEntity<Contract> update(@RequestBody Contract contract){
        Contract res = service.update(contract);
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }
    @DeleteMapping("delete/{id:.+}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


