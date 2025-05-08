package org.example.airlineBookingSystem.controler;


import org.example.airlineBookingSystem.model.Customer;
import org.example.airlineBookingSystem.model.CustomerStatus;
import org.example.airlineBookingSystem.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/status/{status}")
    public List<Customer> getCustomersByStatus(@PathVariable String status) {//@PathVariable CustomerStatus status)
        // Convertir la chaîne en enum
        CustomerStatus customerStatus = CustomerStatus.valueOf(status.toUpperCase());
        return customerService.getCustomersByStatus(customerStatus);
    }

    @GetMapping("/high-mileage")
    public List<Customer> getCustomersWithHighMileage() {
        return customerService.getCustomersWithHighMileage();
    }
}
