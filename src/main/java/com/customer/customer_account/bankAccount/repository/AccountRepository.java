package com.customer.customer_account.bankAccount.repository;

import com.customer.customer_account.bankAccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query("SELECT MAX(balance) from Account ")
    Double findAccountByBalance();

}
