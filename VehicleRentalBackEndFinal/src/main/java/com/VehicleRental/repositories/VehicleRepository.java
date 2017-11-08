package com.VehicleRental.repositories;

import com.VehicleRental.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Zany on 11/4/2017.
 */
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
    //public List<Vehicle> findByCategorycategoryID(String categoryID);
}