package com.VehicleRental.services.Impl;


import com.VehicleRental.domain.Rental;
import com.VehicleRental.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by L.z Double E on 11/3/2017.
 */
@Service
public class RentalServiceImpl{

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getAll(){
        List<Rental> rentals = new ArrayList<>();
        rentalRepository.findAll()
                .forEach(rentals::add);
        return rentals;
    }

    public Rental create(Rental entity){
        return rentalRepository.save(entity);
    }

    public Rental read(Long rentalID){
        return rentalRepository.findOne(rentalID);
    }

    public Rental update(Long rentalID, Rental rentals){
        return rentalRepository.save(rentals);
    }

    public void delete(Long rentalID){
        rentalRepository.delete(rentalID);
    }
}