package org.example.airlineBookingSystem;

import org.example.airlineBookingSystem.model.Customer;
import org.example.airlineBookingSystem.model.CustomerStatus;
import org.example.airlineBookingSystem.model.Flight;
import org.example.airlineBookingSystem.model.FlightBooking;
import org.example.airlineBookingSystem.repository.CustomerRepository;
import org.example.airlineBookingSystem.repository.FlightBookingRepository;
import org.example.airlineBookingSystem.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AirlineBookingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirlineBookingSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository customerRepo,
                          FlightRepository flightRepo,
                          FlightBookingRepository bookingRepo) {
        return args -> {
            Customer alice = customerRepo.save(new Customer("Alice", CustomerStatus.GOLD, 120000));
            Flight flight = flightRepo.save(new Flight("AB123", "Boeing 747", 300, 400));
            bookingRepo.save(new FlightBooking(alice.getId(), flight.getId()));
        };
    }
}


