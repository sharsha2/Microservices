package com.sample.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegestrationRequest request) {
        //Using build patterns
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //TODO: Check if email is valid
        //TODO: Check if email is not taken
        customerRepository.save(customer);
    }
}
