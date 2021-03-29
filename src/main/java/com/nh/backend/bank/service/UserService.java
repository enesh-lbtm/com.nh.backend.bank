package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Users login(Users users) {
        Optional<Users> u = repository.findByLoginAndPassword(users.getLogin(), users.getPassword());
        return u.orElse(null);
    }
    public Users register(Users users) {
        return repository.save(users);
    }

}
