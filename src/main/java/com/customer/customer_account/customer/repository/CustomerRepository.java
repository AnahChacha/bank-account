package com.customer.customer_account.customer.repository;

import com.customer.customer_account.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Optional<Customer>findByEmail(String email);
}
