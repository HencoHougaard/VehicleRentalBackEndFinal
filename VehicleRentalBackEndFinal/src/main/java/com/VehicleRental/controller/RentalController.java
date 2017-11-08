package com.VehicleRental.controller;

import com.VehicleRental.domain.Rental;
import com.VehicleRental.services.Impl.RentalServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by L.z Double E on 11/3/2017.
 */

@Controller
@RequestMapping(value = "/rent")
public class RentalController {

    @Autowired
    private RentalServiceImpl rentalService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Rental> getAllRentals(){
        return rentalService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addRental(@RequestBody Rental rental){
        rentalService.create(rental);
    }

    @RequestMapping(value="/find{rentalID}")
    public @ResponseBody Rental findRental(@PathVariable Long rentalID){
        return rentalService.read(rentalID);
    }

    @RequestMapping(value="/update/{rentalID}", method = RequestMethod.PUT)
    public void updateRental(@RequestBody Rental rental, @PathVariable Long rentalID){
        rentalService.update(rentalID, rental);
    }

    @RequestMapping(value="/delete/{rentalID}",  method = RequestMethod.DELETE)
    public void deleteRental(@PathVariable Long rentalID){

        rentalService.delete(rentalID);
    }

}
