package com.customer.customer_account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CustomerAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerAccountApplication.class, args);
        System.out.println( customerAccount());

    }

    public static String customerAccount(){
        return "kcb bank customer account";
    }

    @GetMapping("/customer")
    public String customerAccounts(){
        return "these application should show all the relationships";
    }

}
