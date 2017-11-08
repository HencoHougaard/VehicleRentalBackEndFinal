package com.VehicleRental.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Billing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billingID;
    private Date billingDate;
    private BigDecimal amountOwed;
    private BigDecimal amountPaid;
    private BigDecimal amountOutstanding;
    @OneToOne
    private Rental rental;


    public Long getbillingID() {
        return billingID;
    }

    public Date getbillingDate() {
        return billingDate;
    }

    public  BigDecimal getAmountOwed() {
        return amountOwed;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public BigDecimal getAmountOutstanding() {
        return amountOutstanding;
    }

    public Rental getRental() {
        return rental;
    }


    public Billing(){

    }

    public Billing(Builder builder) {
        this.billingID = builder.billingID;
        this.billingDate = builder.billingDate;
        this.amountOwed = builder.amountOwed;
        this.amountPaid = builder.amountPaid;
        this.amountOutstanding = builder.amountOutstanding;
        this.rental = builder.rental;

    }

    public static class Builder{
        private Long billingID;
        private Date billingDate;
        private BigDecimal amountOwed;
        private BigDecimal amountPaid;
        private BigDecimal amountOutstanding;
        private Rental rental;



        public Builder billingID(Long value){
            this.billingID = value;
            return this;
        }

        public Builder billingDate(Date value){
            this.billingDate = value;
            return this;
        }

        public Builder amountOwed(BigDecimal value){
            this.amountOwed = value;
            return this;
        }

        public Builder amountPaid(BigDecimal value){
            this.amountPaid = value;
            return this;
        }

        public Builder amountOutstanding(BigDecimal value){
            this.amountOutstanding = value;
            return this;
        }

        public Builder rental(Rental value){
            this.rental = value;
            return this;
        }



        public Billing build(){
            return new Billing(this);
        }
    }

}

