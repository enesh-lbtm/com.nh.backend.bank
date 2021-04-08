package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.entity.UsersStatus;
import com.nh.backend.bank.repository.UsersStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  UsersStatusService {

    @Autowired
    private UsersStatusRepository repository;



    public UsersStatus read(Long id) {
        Optional<UsersStatus> usersStatus = repository.findById(id);
        return usersStatus.orElse(null);

    }

    public List<UsersStatus> readAll() {
        return repository.findAll();
    }

    public UsersStatus create(UsersStatus usersStatus) {
        return repository.save(usersStatus);
    }
    public UsersStatus update(UsersStatus usersStatus) {
        return repository.save(usersStatus);

    }
    public void delete(Long id) {
        repository.deleteById(id);

    }
}


