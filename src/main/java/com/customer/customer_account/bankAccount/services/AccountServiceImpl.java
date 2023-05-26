package com.customer.customer_account.bankAccount.services;

import com.customer.customer_account.bankAccount.dto.AccountDto;
import com.customer.customer_account.bankAccount.enums.TransactionType;
import com.customer.customer_account.bankAccount.model.Account;
import com.customer.customer_account.bankAccount.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Account createAccount(AccountDto accountDto) {
        Account account = new Account();
//        account.setDeposit(AccountStatus.DEBIT.ordinal());
//        account.setWithdraw(AccountStatus.CREDIT.ordinal());


//        account.setBalance(accountDto.getBalance());
        switch (accountDto.getTransactionType()){
            case DEPOSIT:
                Double total;
                Double currentBalance=accountRepository.findAccountByBalance();
                if (currentBalance==null){
                    currentBalance=0.0;
                    total=accountDto.getDeposit()+currentBalance;
                    account.setBalance(total);
                }else {
                    total=accountDto.getDeposit()+currentBalance;
                    account.setBalance(total);
                }


                break;

            case WITHDRAW:
                currentBalance=accountRepository.findAccountByBalance();
                if (currentBalance !=null){
                    total=currentBalance-accountDto.getWithdraw();
                    account.setBalance(total);
                }else {
                    if (currentBalance ==null){

                    }
                }

                break;

            default:
                break;

        }
        account.setCustomerId(accountDto.getCustomerId());
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public boolean doesNotExit(TransactionType transactionType) {
       Double currentBalance=accountRepository.findAccountByBalance();
       if (currentBalance==null){
           return  true;
       }
      return  false;
    }
}
