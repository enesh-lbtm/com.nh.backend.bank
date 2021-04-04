package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.entity.UsersDocument;
import com.nh.backend.bank.repository.UsersDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersDocumentService   {

    @Autowired
    private UsersDocumentRepository repository;



    public UsersDocument read(Long id) {
        Optional<UsersDocument> usersDocument = repository.findById(id);
        return usersDocument.orElse(null);
    }
    public UsersDocument create(UsersDocument usersDocument) {
        return repository.save(usersDocument);

    }
    public UsersDocument update(UsersDocument usersDocument) {
        return repository.save(usersDocument);

    }
    public void delete(Long id) {
repository.deleteById(id);
    }
    public List<UsersDocument> readAll(){
        return repository.findAll();
    }
  }



