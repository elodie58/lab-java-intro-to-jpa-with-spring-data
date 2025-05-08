package org.example.airlineBookingSystem.repository;

import org.example.airlineBookingSystem.model.Customer;
import org.example.airlineBookingSystem.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


    //Add a query method in CustomerRepository to find customers by status:
    List<Customer> findByStatus(CustomerStatus status);

    //Add a method in CustomerRepository to find customers with mileage over 100,000

    List<Customer> findByTotalMilesFlownGreaterThan(Integer totalMilesFlownIsGreaterThan100000);

    //List<Customer> findByTotalMilesFlownGreaterThan(Integer miles);
}

