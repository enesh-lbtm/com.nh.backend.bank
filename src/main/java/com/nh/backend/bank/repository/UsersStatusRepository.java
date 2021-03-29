package com.nh.backend.bank.repository;

import com.nh.backend.bank.entity.UsersStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersStatusRepository extends JpaRepository<UsersStatus, Long> {
}