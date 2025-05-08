package org.example.airlineBookingSystem.controler;


import org.example.airlineBookingSystem.model.FlightBooking;
import org.example.airlineBookingSystem.service.FlightBookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class FlightBookingController {

    private final FlightBookingService flightBookingService;

    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    @GetMapping("/customer/{customerId}")
    public List<FlightBooking> getBookingsByCustomerId(@PathVariable Long customerId) {
        return flightBookingService.getBookingsByCustomerId(customerId);
    }

    @GetMapping("/flight/{flightId}")
    public List<FlightBooking> getBookingsByFlightId(@PathVariable Long flightId) {
        return flightBookingService.getBookingsByFlightId(flightId);
    }
}
