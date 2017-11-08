package com.VehicleRental.controller;

import com.VehicleRental.domain.Category;
import com.VehicleRental.services.Impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/cat")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Category> getAllCategories(){
        return categoryService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addCategory(@RequestBody Category category){
        categoryService.create(category);
    }

    @RequestMapping(value="/find{categoryID}")
    public @ResponseBody Category findCategory(@PathVariable String categoryID){
        return categoryService.read(categoryID);
    }

    @RequestMapping(value="/update/{categoryID}", method = RequestMethod.PUT)
    public void updateCategory(@RequestBody Category category, @PathVariable String categoryID){
        categoryService.update(categoryID, category);
    }

    @RequestMapping(value="/delete/{categoryID}",  method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable String categoryID){

        categoryService.delete(categoryID);
    }

}
