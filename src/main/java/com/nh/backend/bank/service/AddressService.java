package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Address;
import com.nh.backend.bank.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService  {

    @Autowired
    private AddressRepository repository;

    public Address read(Long id) {
        Optional<Address> address = repository.findById(id);
        return address.orElse(null);

    }
    public Address create(Address address) {
        return repository.save(address);
    }
    public Address update(Address address) {
        return repository.save(address);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }

}

