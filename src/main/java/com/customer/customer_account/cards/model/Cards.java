package com.customer.customer_account.cards.model;
import com.customer.customer_account.customer.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards_tb")
public class Cards{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cards_id")
    private long cardsId;

    @ManyToOne
    @JoinColumn(name = "customer",referencedColumnName = "customer_id")
    private Customer customer;

    @Column(name = "debit_number")
    private String debitNo;

    @Column(name = "credit_number")
    private String creditNo;
}
