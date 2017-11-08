package com.VehicleRental.factories;

import com.VehicleRental.domain.Customer;

public class CustomerFactory {
    public static Customer buildCustomer(String customerLicenceNum, String customerFirstName, String customerLastName, String customerAddressStreet, String customerAddressArea, String customerAddressCity, String customerAddressCode, String customerContactNumber, String customerEmail, Boolean customerCleared){
        Customer customer = new Customer.Builder()
                .customerLicenceNum(customerLicenceNum)
                .customerFirstName(customerFirstName)
                .customerLastName(customerLastName)
                .customerAddressStreet(customerAddressStreet)
                .customerAddressArea(customerAddressArea)
                .customerAddressCity(customerAddressCity)
                .customerAddressCode(customerAddressCode)
                .customerContactNumber(customerContactNumber)
                .customerEmail(customerEmail)
                .customerCleared(customerCleared)
                .build();
        return customer;
    }
}
