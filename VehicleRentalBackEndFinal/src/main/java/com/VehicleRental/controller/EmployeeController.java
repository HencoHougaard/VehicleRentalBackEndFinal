package com.VehicleRental.controller;


import com.VehicleRental.domain.Employee;
import com.VehicleRental.services.Impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/emp")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Employee> getAllEmployees(){
        return employeeService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee){
        employeeService.create(employee);
    }

    @RequestMapping(value="/find{employeeID}")
    public @ResponseBody Employee findEmployee(@PathVariable Long employeeID){
        return employeeService.read(employeeID);
    }

    @RequestMapping(value="/update/{employeeID}", method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee, @PathVariable Long employeeID){
        employeeService.update(employeeID, employee);
    }

    @RequestMapping(value="/delete/{employeeID}",  method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Long employeeID){

        employeeService.delete(employeeID);
    }

}
