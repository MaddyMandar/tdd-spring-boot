package com.darkseid.tddspringboot.repository;

import com.darkseid.tddspringboot.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Long> {
    Car findByName(String name);
}
