package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Address;
import com.nh.backend.bank.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService  {

    @Autowired
    private AddressRepository repository;

    public void read(Long id) {

    }
    public void create(Address address) {

    }
    public void update(Address address) {

    }
    public void delete(Long id) {

    }

}

