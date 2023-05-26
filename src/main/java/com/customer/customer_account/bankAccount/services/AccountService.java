package com.customer.customer_account.bankAccount.services;

import com.customer.customer_account.bankAccount.dto.AccountDto;
import com.customer.customer_account.bankAccount.enums.TransactionType;
import com.customer.customer_account.bankAccount.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(AccountDto accountDto);

    List<Account>getAllAccounts();

    boolean doesNotExit(TransactionType transactionType);
}
