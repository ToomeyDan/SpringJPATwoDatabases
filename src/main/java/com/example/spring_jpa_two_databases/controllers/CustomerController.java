package com.example.spring_jpa_two_databases.controllers;

import com.example.spring_jpa_two_databases.customer.Customer;
import com.example.spring_jpa_two_databases.customer.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        logger.error("GET /customers");
        return customerService.getAllCustomers();
    }
}
