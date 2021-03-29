package com.nh.backend.bank.controller;



import com.nh.backend.bank.entity.Address;
import com.nh.backend.bank.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public final class AddressController {

    @Autowired
    private AddressService service;

    @GetMapping("address")
    public ResponseEntity<String> id(@RequestBody Address address) {
        return ResponseEntity.ok("hello nh");
    }
}

