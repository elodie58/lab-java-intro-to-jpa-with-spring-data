package org.example.airlineBookingSystem.service;


import org.example.airlineBookingSystem.model.Customer;
import org.example.airlineBookingSystem.model.CustomerStatus;
import org.example.airlineBookingSystem.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomersByStatus(CustomerStatus status) {
        return customerRepository.findByStatus(status);
    }

    public List<Customer> getCustomersWithHighMileage() {
        return customerRepository.findByTotalMilesFlownGreaterThan(100000);
    }
}


