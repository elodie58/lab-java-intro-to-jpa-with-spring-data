package org.example.airlineBookingSystem.service;


import org.example.airlineBookingSystem.model.FlightBooking;
import org.example.airlineBookingSystem.repository.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {

    private final FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    public List<FlightBooking> getBookingsByCustomerId(Long customerId) {
        return flightBookingRepository.findByCustomerId(customerId);
    }

    public List<FlightBooking> getBookingsByFlightId(Long flightId) {
        return flightBookingRepository.findByFlightId(flightId);
    }
}

