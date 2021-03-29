package com.nh.backend.bank.controller;


import com.nh.backend.bank.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public final class ContractController {

    @Autowired
    private ContractService service;

    @GetMapping("contract/{id}")
    public ResponseEntity<String> readContract(@PathVariable("id") Long id) {
        return ResponseEntity.ok("hello "+id);
    }
}


