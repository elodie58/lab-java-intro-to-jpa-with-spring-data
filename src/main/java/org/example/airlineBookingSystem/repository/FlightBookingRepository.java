package org.example.airlineBookingSystem.repository;

import org.example.airlineBookingSystem.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {

    //Add a query method in FlightBookingRepository to find bookings by customer ID

    List<FlightBooking> findByCustomerId(Long customerId);

    //Add a method in FlightBookingRepository to find bookings by flight ID

    List<FlightBooking> findByFlightId(Long flightId);

}
