package com.driver.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @NotNull
    private String mobile;

    @NotNull
    private String password;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    public Customer() {
    }

    public Customer(int customerId, String mobile, String password) {
        this.customerId = customerId;
        this.mobile = mobile;
        this.password = password;
    }


}