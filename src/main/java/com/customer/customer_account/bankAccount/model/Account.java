package com.customer.customer_account.bankAccount.model;

import com.customer.customer_account.bankAccount.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts_tb")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private long accountId;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "account_balance")
    private double balance = 0.0;

    @Column(name = "withdraw")
    private double withdraw;

    @Column(name = "deposit")
    private double deposit;

    @Column(name = "current_amount")
    private double currentAmount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;


}
