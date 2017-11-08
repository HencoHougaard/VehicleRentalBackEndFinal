package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Vehicle;
import com.VehicleRental.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zany on 11/4/2017.
 */

@Service
public class VehicleServiceImpl{

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAll(){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicleRepository.findAll()
                .forEach(vehicles::add);
        return vehicles;
    }

    public Vehicle create(Vehicle entity){
        return vehicleRepository.save(entity);
    }

    public Vehicle read(Long vehicleID){
        return vehicleRepository.findOne(vehicleID);
    }

    public Vehicle update(Long vehicleID, Vehicle vehicles){
        return vehicleRepository.save(vehicles);
    }

    public void delete(Long vehicleID){
        vehicleRepository.delete(vehicleID);
    }
}