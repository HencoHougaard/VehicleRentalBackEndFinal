package com.VehicleRental.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    private String categoryID;
    private String categoryName;
    private Double categoryPrice;


    public String getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Double getCategoryPrice() {
        return categoryPrice;
    }

    public Category(){

    }

    public Category(Builder builder) {
        this.categoryID = builder.categoryID;
        this.categoryName = builder.categoryName;
        this.categoryPrice = builder.categoryPrice;
    }

    public static class Builder{
        private String categoryID;
        private String categoryName;
        private Double categoryPrice;


    public Builder categoryID(String value){
        this.categoryID = value;
        return this;
    }

    public Builder categoryName(String value){
        this.categoryName = value;
        return this;
    }

    public Builder categoryPrice(Double value){
        this.categoryPrice = value;
        return this;
    }


    public Category build(){
        return new Category(this);
    }
}
}
