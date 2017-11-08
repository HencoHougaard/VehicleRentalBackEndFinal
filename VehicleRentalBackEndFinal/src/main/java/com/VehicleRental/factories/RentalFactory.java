package com.VehicleRental.factories;


import com.VehicleRental.domain.*;
import com.VehicleRental.keyGen.KeyGenerator;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * Created by L.z Double E on 11/3/2017.
 */
public class RentalFactory {
    public static Rental buildRental(Date pickUpDate, Date returnDate, Integer duration, BigDecimal totalAmount, Boolean finalised, Customer customer, Vehicle vehicle, Employee employee) {
        Rental rental = new Rental.Builder()
                .pickUpDate(pickUpDate)
                .returnDate(returnDate)
                .duration(duration)
                .totalAmount(totalAmount)
                .finalised(finalised)
                .customer(customer)
                .vehicle(vehicle)
                .employee(employee)
                .build();
        return rental;
    }
}
