package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.UsersContact;
import com.nh.backend.bank.repository.UsersContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersContactService    {

    @Autowired
    private UsersContactRepository repository;

    public UsersContact read(Long id) {
        Optional<UsersContact> usersContact = repository.findById(id);
        return usersContact.orElse(null);
    }
    public UsersContact create(UsersContact usersContact) {
        return repository.save(usersContact);

    }
    public UsersContact update(UsersContact usersContact) {
        return repository.save(usersContact);

    }
    public void delete(Long id) {
        repository.deleteById(id);

    }


}


