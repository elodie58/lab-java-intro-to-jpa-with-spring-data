package org.example.airlineBookingSystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                // booking_id int auto increment not null primary key

    private Long customerId;        //customer_id varchar not null >>>in my old lab
    private Long flightId;

    public FlightBooking() {}

    public FlightBooking(Long customerId, Long flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public void setCustomer(Customer customer) {
    }

    public void setFlight(Flight flight) {
    }


}
