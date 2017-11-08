package com.VehicleRental.factories;

import com.VehicleRental.domain.Employee;

public class EmployeeFactory {
    public static Employee buildEmployee(String employeeFirstName, String employeeLastName, String employeeEmailAddress, String employeeUserName, String employeePassword, String employeeRole){
        Employee employee = new Employee.Builder()
                .employeeFirstName(employeeFirstName)
                .employeeLastName(employeeLastName)
                .employeeEmailAddress(employeeEmailAddress)
                .employeeUserName(employeeUserName)
                .employeePassword(employeePassword)
                .employeeRole(employeeRole)
                .build();
        return employee;
    }
}
