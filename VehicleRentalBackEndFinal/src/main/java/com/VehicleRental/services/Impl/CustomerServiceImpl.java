package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Customer;
import com.VehicleRental.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll()
                .forEach(customers::add);
        return customers;
    }

    public Customer create(Customer entity){
        return customerRepository.save(entity);
    }

    public Customer read(Long customerID){
        return customerRepository.findOne(customerID);
    }

    public Customer update(Long customerID, Customer customers){
        return customerRepository.save(customers);
    }

    public void delete(Long customerID){
        customerRepository.delete(customerID);
    }
}
