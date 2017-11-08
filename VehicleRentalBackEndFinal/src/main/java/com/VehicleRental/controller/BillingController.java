package com.VehicleRental.controller;

import com.VehicleRental.domain.*;
import com.VehicleRental.services.Impl.BillingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/bill")
public class BillingController {

    @Autowired
    private BillingServiceImpl billingService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Billing> getAllBills(){
        return billingService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addBill(@RequestBody Billing billing){
        billingService.create(billing);
    }

    @RequestMapping(value="/find{billingID}")
    public @ResponseBody Billing findBill(@PathVariable Long billingID){
        return billingService.read(billingID);
    }

    @RequestMapping(value="/update/{billingID}", method = RequestMethod.PUT)
    public void updateBilling(@RequestBody Billing billing, @PathVariable Long billingID){
        billingService.update(billingID, billing);
    }

    @RequestMapping(value="/delete/{billingID}",  method = RequestMethod.DELETE)
    public void deleteBill(@PathVariable Long billingID){

        billingService.delete(billingID);
    }

}

