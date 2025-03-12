package com.example.spring_jpa_two_databases.customer;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional("customerTransactionManager")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
