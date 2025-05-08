package org.example.airlineBookingSystem.model;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;                        //customer_name varchar not null>>> in my old lab

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;              //varchar not null>>>in my old lab

    private Integer totalMilesFlown;            //totalCustomerMileage int not null>>>in my old lab

    public Customer() {}

    public Customer(String name, CustomerStatus status, Integer totalMilesFlown) {
        this.name = name;
        this.status = status;
        this.totalMilesFlown = totalMilesFlown;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public Integer getTotalMilesFlown() {
        return totalMilesFlown;
    }

    public void setTotalMilesFlown(Integer totalMilesFlown) {
        this.totalMilesFlown = totalMilesFlown;
    }


}

