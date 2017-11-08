package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Category;
import com.VehicleRental.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll()
                .forEach(categories::add);
        return categories;
    }

    public Category create(Category entity){
        return categoryRepository.save(entity);
    }

    public Category read(String categoryID){
        return categoryRepository.findOne(categoryID);
    }

    public Category update(String categoryID, Category categories){
        return categoryRepository.save(categories);
    }

    public void delete(String categoryID){
        categoryRepository.delete(categoryID);
    }
}
