package com.VehicleRental.controller;

import com.VehicleRental.domain.Customer;
import com.VehicleRental.services.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/cust")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Customer> getAllCustomers(){
        return customerService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer){
        customerService.create(customer);
    }

    @RequestMapping(value="/find{customerID}")
    public @ResponseBody Customer findCustomer(@PathVariable Long customerID){
        return customerService.read(customerID);
    }

    @RequestMapping(value="/update/{customerID}", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Long customerID){
        customerService.update(customerID, customer);
    }

    @RequestMapping(value="/delete/{customerID}",  method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable Long customerID){

        customerService.delete(customerID);
    }

}