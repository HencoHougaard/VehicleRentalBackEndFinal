package com.VehicleRental.factories;

import com.VehicleRental.domain.Category;
import com.VehicleRental.domain.Vehicle;

import java.util.Map;

/**
 * Created by Zany on 11/4/2017.
 */
public class VehicleFactory {
    public static Vehicle buildVehicle(String vehicleRegNum, String vehicleMake, String vehicleModel, Boolean vehicleAvailability, Category category) {
        Vehicle vehicle = new Vehicle.Builder()
                .vehicleRegNum(vehicleRegNum)
                .vehicleMake(vehicleMake)
                .vehicleModel(vehicleModel)
                .vehicleAvailability(vehicleAvailability)
                .category(category)
                .build();
        return vehicle;
    }
}
