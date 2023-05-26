package com.customer.customer_account.customer.model;

import com.customer.customer_account.bankAccount.model.Account;
import com.customer.customer_account.cards.model.Cards;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_tb")
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private String phoneNo;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Cards>cards;

    @OneToMany(mappedBy = "customerId",cascade = CascadeType.ALL)
    List<Account>accounts;
}
