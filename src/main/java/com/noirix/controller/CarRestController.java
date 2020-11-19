package com.noirix.controller;

import com.noirix.controller.request.CarChangeRequest;
import com.noirix.controller.request.CarCreateRequest;
import com.noirix.controller.request.SearchCriteria;
import com.noirix.domain.Car;
import com.noirix.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/rest/cars")
@RequiredArgsConstructor
public class CarRestController {

    public final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> findAllCars() {

        throw new RuntimeException("Test Controller advice");
        //return ResponseEntity.ok(carService.findAll());
        //return new ResponseEntity<>(carService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car findCarById(@PathVariable Long id) {
        return carService.findById(id);
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    public List<Car> carSearch(@ModelAttribute SearchCriteria search) {
        return carService.search(search.getQuery());
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car savingCar(@RequestBody CarCreateRequest carCreateRequest) {
        //converters
        Car car = new Car();
        car.setCreation(carCreateRequest.getCreation());
        car.setColor(carCreateRequest.getColor());
        car.setModel(carCreateRequest.getModel());
        car.setCountry_of_creation(car.getCountry_of_creation());
        car.setCapacity_l(car.getCapacity_l());
        car.setGuarantee_expiration_date(new Timestamp(System.currentTimeMillis()));
        car.setPrice(carCreateRequest.getPrice());
        car.setDealer_id(carCreateRequest.getDealer_id());
        return carService.save(car);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car updateCar(@PathVariable Long id,
                          @RequestBody CarCreateRequest carCreateRequest) {

        Car car = carService.findById(id);

        //converters
        car.setCreation(carCreateRequest.getCreation());
        car.setColor(carCreateRequest.getColor());
        car.setModel(carCreateRequest.getModel());
        car.setCountry_of_creation(car.getCountry_of_creation());
        car.setCapacity_l(carCreateRequest.getCapacity_l());
        car.setGuarantee_expiration_date(new Timestamp(System.currentTimeMillis()));
        car.setPrice(carCreateRequest.getPrice());
        car.setDealer_id(carCreateRequest.getDealer_id());
        return carService.update(car);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Car updateCar(@RequestBody CarChangeRequest carChangeRequest) {

        Car car = carService.findById(carChangeRequest.getId());

        //converters
        car.setCreation(carChangeRequest.getCreation());
        car.setColor(carChangeRequest.getColor());
        car.setModel(carChangeRequest.getModel());
        car.setCountry_of_creation(car.getCountry_of_creation());
        car.setCapacity_l(car.getCapacity_l());
        car.setGuarantee_expiration_date(new Timestamp(System.currentTimeMillis()));
        car.setPrice(carChangeRequest.getPrice());
        car.setDealer_id(carChangeRequest.getDealer_id());
        return carService.update(car);
    }
}