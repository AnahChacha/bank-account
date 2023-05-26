package com.customer.customer_account.bankAccount.controller;

import com.customer.customer_account.bankAccount.dto.AccountDto;
import com.customer.customer_account.bankAccount.model.Account;
import com.customer.customer_account.bankAccount.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("account")
public class AccountController {
    private final AccountService accountService;

    @PostMapping(value = "/createAccount")
    public ResponseEntity<?>createAccount(@RequestBody AccountDto accountDto){
//        if (accountService.doesNotExit(TransactionType.valueOf("WITHDRAW"))){
//            return new ResponseEntity<>("you have insufficient funds",HttpStatus.NOT_FOUND);
//        }
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.createAccount(accountDto));
    }

    @GetMapping(value = "/getAllAccounts")
    public ResponseEntity<List<Account>>getAllAccounts(){
        return ResponseEntity.ok(accountService.getAllAccounts());
    }
}
