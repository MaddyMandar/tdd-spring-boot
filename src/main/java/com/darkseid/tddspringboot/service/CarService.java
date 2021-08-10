package com.darkseid.tddspringboot.service;

import com.darkseid.tddspringboot.exception.CarNotFoundException;
import com.darkseid.tddspringboot.models.Car;
import com.darkseid.tddspringboot.repository.CarRepository;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {

        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {
        Car car = carRepository.findByName(name);

        if(car == null) {
            throw new CarNotFoundException();
        }
        return car;
    }
}
