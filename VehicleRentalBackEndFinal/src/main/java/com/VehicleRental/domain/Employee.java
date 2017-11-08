package com.VehicleRental.domain;

import javax.persistence.*;

import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Entity
public class Employee implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeEmailAddress;
    private String employeeUserName;
    private String employeePassword;
    private String employeeRole;

    public Long getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmployeeEmailAddress() {
        return employeeEmailAddress;
    }

    public String getEmployeeUserName() {
        return employeeUserName;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }


    public Employee(){

    }

    public Employee(Builder builder) {
        this.employeeID = builder.employeeID;
        this.employeeFirstName = builder.employeeFirstName;
        this.employeeLastName = builder.employeeLastName;
        this.employeeEmailAddress = builder.employeeEmailAddress;
        this.employeeUserName = builder.employeeUserName;
        this.employeePassword = builder.employeePassword;
        this.employeeRole = builder.employeeRole;

    }

    public static class Builder{
        private Long employeeID;
        private String employeeFirstName;
        private String employeeLastName;
        private String employeeEmailAddress;
        private String employeeUserName;
        private String employeePassword;
        private String employeeRole;


        public Builder employeeID(Long value){
            this.employeeID = value;
            return this;
        }

        public Builder employeeFirstName(String value){
            this.employeeFirstName = value;
            return this;
        }

        public Builder employeeLastName(String value){
            this.employeeLastName = value;
            return this;
        }

        public Builder employeeEmailAddress(String value){
            this.employeeEmailAddress = value;
            return this;
        }

        public Builder employeeUserName(String value){
            this.employeeUserName = value;
            return this;
        }

        public Builder employeePassword(String value){
            this.employeePassword = value;
            return this;
        }

        public Builder employeeRole(String value){
            this.employeeRole = value;
            return this;
        }


        public Employee build(){
            return new Employee(this);
        }
    }
}

