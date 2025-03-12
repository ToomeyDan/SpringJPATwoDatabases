package com.example.spring_jpa_two_databases.customer;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class CustomerDataInitializer {

    private final CustomerRepository customerRepository;

    public CustomerDataInitializer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostConstruct
    public void init() {
        if (customerRepository.count() == 0) {
            customerRepository.save(Customer.builder()
                    .firstName("First")
                    .lastName("Last")
                    .build());
            customerRepository.save(Customer.builder()
                    .firstName("Second")
                    .lastName("Customer")
                    .build());
        }
    }
}


