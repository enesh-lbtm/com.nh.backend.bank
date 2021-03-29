package com.nh.backend.bank.repository;

import com.nh.backend.bank.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByLoginAndPassword(String login, String password);
}
