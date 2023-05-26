package com.customer.customer_account.customer.controller;

import com.customer.customer_account.customer.dto.CustomerDto;
import com.customer.customer_account.customer.model.Customer;
import com.customer.customer_account.customer.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping(value = "/createCustomer")
    public ResponseEntity<Customer>createCustomer(@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok(customerService.createCustomer(customerDto));
    }

    @GetMapping(value = "/getAllCustomers")
    public ResponseEntity<List<Customer>>getAllCustomers(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }
}
