package com.VehicleRental.factories;

import com.VehicleRental.domain.Category;
import com.VehicleRental.domain.Vehicle;

import java.util.List;

public class CategoryFactory {
    public static Category buildCategory(String categoryID, String categoryName, Double categoryPrice){
        Category category = new Category.Builder()
                .categoryID(categoryID)
                .categoryName(categoryName)
                .categoryPrice(categoryPrice)
                .build();
        return category;
    }
}
