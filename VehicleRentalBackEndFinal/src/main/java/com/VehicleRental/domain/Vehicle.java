package com.VehicleRental.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Zany on 11/4/2017.
 */

@Entity
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleID;
    private String vehicleRegNum;
    private String vehicleMake;
    private String vehicleModel;
    private Boolean vehicleAvailability;
    @ManyToOne
    private Category category;

    public Long getVehicleID() {
        return vehicleID;
    }

    public String getVehicleRegNum() {
        return vehicleRegNum;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public Boolean getVehicleAvailability() {
        return vehicleAvailability;
    }

    public Category getCategory() {
        return category;
    }

    public Vehicle(){

    }

    public Vehicle(Builder builder) {
        this.vehicleID = builder.vehicleID;
        this.vehicleRegNum = builder.vehicleRegNum;
        this.vehicleMake = builder.vehicleMake;
        this.vehicleModel = builder.vehicleModel;
        this.vehicleAvailability = builder.vehicleAvailability;
        this.category = builder.category;
    }

    public static class Builder{
        private Long vehicleID;
        private String vehicleRegNum;
        private String vehicleMake;
        private String vehicleModel;
        private Boolean vehicleAvailability;
        private Category category;



        public Builder vehicleID(Long value){
            this.vehicleID = value;
            return this;
        }

        public Builder vehicleRegNum(String value){
            this.vehicleRegNum = value;
            return this;
        }

        public Builder vehicleMake(String value){
            this.vehicleMake = value;
            return this;
        }

        public Builder vehicleModel(String value){
            this.vehicleModel = value;
            return this;
        }

        public Builder vehicleAvailability(Boolean value){
            this.vehicleAvailability = value;
            return this;
        }

        public Builder category(Category value){
            this.category = value;
            return this;
        }


        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
