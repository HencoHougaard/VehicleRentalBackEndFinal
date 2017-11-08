package com.VehicleRental.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by L.z Double E on 11/2/2017.
 */
@Entity
public class Rental implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rentalID;
    private Date pickUpDate;
    private Date returnDate;
    private Integer duration;
    private BigDecimal totalAmount;
    private Boolean finalised;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private Employee employee;

    public Long getBookingID() {
        return rentalID;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public Boolean getFinalised() {
        return finalised;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Rental(){

    }

    public Rental(Builder builder){
        this.rentalID = builder.rentalID;
        this.pickUpDate = builder.pickUpDate;
        this.returnDate = builder.returnDate;
        this.duration = builder.duration;
        this.totalAmount = builder.totalAmount;
        this.finalised = builder.finalised;
        this.customer = builder.customer;
        this.vehicle = builder.vehicle;
        this.employee = builder.employee;
    }

    public static class Builder{
        private Long rentalID;
        private Date pickUpDate;
        private Date returnDate;
        private Integer duration;
        private BigDecimal totalAmount;
        private Boolean finalised;
        private Customer customer;
        private Vehicle vehicle;
        private Employee employee;


        public Builder rentalID(Long value){
            this.rentalID = value;
            return this;
        }

        public Builder pickUpDate(Date value){
            this.pickUpDate = value;
            return this;
        }

        public Builder returnDate(Date value){
            this.returnDate = value;
            return this;
        }

        public Builder duration(Integer value){
            this.duration = value;
            return this;
        }

        public Builder totalAmount(BigDecimal value){
            this.totalAmount = value;
            return this;
        }

        public Builder finalised(Boolean value){
            this.finalised = value;
            return this;
        }

        public Builder customer(Customer value){
            this.customer = value;
            return this;
        }

        public Builder vehicle(Vehicle value){
            this.vehicle = value;
            return this;
        }

        public Builder employee(Employee value){
            this.employee = value;
            return this;
        }

        public Rental build(){
            return new Rental(this);
        }
    }
}
