package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Billing;
import com.VehicleRental.repositories.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillingServiceImpl{

    @Autowired
    private BillingRepository billingRepository;

    public List<Billing> getAll() {
        List<Billing> bills = new ArrayList<>();
        billingRepository.findAll()
                .forEach(bills::add);
        return bills;
    }

    public Billing create(Billing entity) {

        return billingRepository.save(entity);
    }

    public Billing read(Long billingID) {
        return billingRepository.findOne(billingID);
    }

    public Billing update(Long billingID, Billing bills) {
        return billingRepository.save(bills);
    }

    public void delete(Long billingID){
        billingRepository.delete(billingID);
    }
}
