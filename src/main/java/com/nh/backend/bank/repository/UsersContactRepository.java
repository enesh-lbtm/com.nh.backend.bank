package com.nh.backend.bank.repository;


import com.nh.backend.bank.entity.Users;
import com.nh.backend.bank.entity.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersContactRepository extends JpaRepository<UsersContact,Long> {

}
