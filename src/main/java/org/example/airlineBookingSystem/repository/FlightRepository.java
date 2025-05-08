package org.example.airlineBookingSystem.repository;


import org.example.airlineBookingSystem.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    //I can add query methods if needed

}
