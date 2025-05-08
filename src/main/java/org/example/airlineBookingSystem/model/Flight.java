package org.example.airlineBookingSystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private Long id;

    private String flightNumber;                    //fightNumber varchar not null,primary key>>>in my old lab
    private String aircraft;                        //aircraft_name varchar not null>>>in my old lab
    private Integer TotalNumberOfSeats;             //totalAircraftSeats int not null>>>in my old lab
    private Integer Mileage;                        //flight mileage int not null>>>in my old lab

    public Flight(String flightNumber, String aircraft, Integer totalNumberOfSeats, Integer mileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        TotalNumberOfSeats = totalNumberOfSeats;
        Mileage = mileage;
    }

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalNumberOfSeats() {
        return TotalNumberOfSeats;
    }

    public void setTotalNumberOfSeats(Integer totalNumberOfSeats) {
        TotalNumberOfSeats = totalNumberOfSeats;
    }

    public Integer getMileage() {
        return Mileage;
    }

    public void setMileage(Integer mileage) {
        Mileage = mileage;
    }
}