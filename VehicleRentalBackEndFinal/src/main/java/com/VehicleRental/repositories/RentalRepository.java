package com.VehicleRental.repositories;

import com.VehicleRental.domain.Rental;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by L.z Double E on 11/3/2017.
 */
public interface RentalRepository extends CrudRepository<Rental, Long> {
}
