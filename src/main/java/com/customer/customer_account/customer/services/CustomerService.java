package com.customer.customer_account.customer.services;

import com.customer.customer_account.customer.dto.CustomerDto;
import com.customer.customer_account.customer.model.Customer;

import java.util.List;


public interface CustomerService {
    Customer createCustomer(CustomerDto customerDto);

    List<Customer>getAllCustomers();
}
