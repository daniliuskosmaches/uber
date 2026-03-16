package org.example.analyticservice.Repository;

import org.example.analyticservice.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Repository extends JpaRepository<Account,Long> {
    List<Account> findByAccountNumber(String accountNumber);
}
