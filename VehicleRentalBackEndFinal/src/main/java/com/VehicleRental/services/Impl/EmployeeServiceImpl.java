package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Employee;
import com.VehicleRental.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll()
                .forEach(employees::add);
        return employees;
    }

    public Employee create(Employee entity) {

        return employeeRepository.save(entity);
    }

    public Employee read(Long employeeID) {
        return employeeRepository.findOne(employeeID);
    }

    public Employee update(Long employeeID, Employee employees) {
        return employeeRepository.save(employees);
    }

    public void delete(Long employeeID){
        employeeRepository.delete(employeeID);
    }
}
