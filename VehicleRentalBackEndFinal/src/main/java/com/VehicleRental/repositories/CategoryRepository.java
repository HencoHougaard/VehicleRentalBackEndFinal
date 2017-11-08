package com.VehicleRental.repositories;

import com.VehicleRental.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, String> {
}
