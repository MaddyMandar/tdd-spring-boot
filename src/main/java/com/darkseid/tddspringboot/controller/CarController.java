package com.darkseid.tddspringboot.controller;

import com.darkseid.tddspringboot.exception.CarNotFoundException;
import com.darkseid.tddspringboot.models.Car;
import com.darkseid.tddspringboot.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{name}")
    private Car getCar(@PathVariable String name){
        return carService.getCarDetails(name);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private void carNotFoundHandler(CarNotFoundException ex){

    }
}
