package com.java.springdata.repository;

import com.java.springdata.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findAccountByName(String name);

}
