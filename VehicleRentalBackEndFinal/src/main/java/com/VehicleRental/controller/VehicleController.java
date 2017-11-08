package com.VehicleRental.controller;

import com.VehicleRental.domain.Vehicle;
import com.VehicleRental.services.Impl.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zany on 11/4/2017.
 */
@Controller
@RequestMapping(path = "/vehicle")
public class VehicleController {

    @Autowired
    private VehicleServiceImpl vehicleService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Vehicle> getAllVehicles(){
        return vehicleService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addVehicle(@RequestBody Vehicle vehicle){
        vehicleService.create(vehicle);
    }

    @RequestMapping(value="/find{vehicleID}")
    public @ResponseBody Vehicle findVehicle(@PathVariable Long vehicleID){
        return vehicleService.read(vehicleID);
    }

    @RequestMapping(value="/update{vehicleID}", method = RequestMethod.PUT)
    public void updateVehicle(@RequestBody Vehicle vehicle, @PathVariable Long vehicleID){
        vehicleService.update(vehicleID, vehicle);
    }

    @RequestMapping(value="/delete/{vehicleID}",  method = RequestMethod.DELETE)
    public void deleteVehicle(@PathVariable Long vehicleID){

        vehicleService.delete(vehicleID);
    }

}
