package com.nh.backend.bank.repository;

import com.nh.backend.bank.entity.UsersDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDocumentRepository extends JpaRepository<UsersDocument, Long> {

}
