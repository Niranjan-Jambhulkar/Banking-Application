package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.model.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Integer> {

}
