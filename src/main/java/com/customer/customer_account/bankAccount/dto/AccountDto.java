package com.customer.customer_account.bankAccount.dto;
import com.customer.customer_account.bankAccount.enums.TransactionType;
import lombok.Data;

@Data
public class AccountDto {
    private long customerId;
    private double withdraw;
    private double deposit;
   private TransactionType transactionType;
}
