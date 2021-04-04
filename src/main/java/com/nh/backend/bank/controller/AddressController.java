package com.nh.backend.bank.controller;



import com.nh.backend.bank.entity.Address;
import com.nh.backend.bank.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/address/")
public final class AddressController {

    @Autowired
    private AddressService service;

    @PostMapping("create")
    public ResponseEntity<Address> create(@RequestBody Address address) {
        Address res = service.create(address);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @GetMapping("read/{id:.+}")
    public ResponseEntity<Address> read(@PathVariable("id") Long id){
        Address res = service.read(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
    @PutMapping("update")
    public ResponseEntity<Address> update(@RequestBody Address address){
        Address res = service.update(address);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @DeleteMapping("delete/{id:.+}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
   }

