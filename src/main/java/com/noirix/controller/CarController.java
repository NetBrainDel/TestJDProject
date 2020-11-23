package com.noirix.controller;

import com.noirix.controller.request.CarCreateRequest;
import com.noirix.controller.request.SearchCriteria;
import com.noirix.controller.request.UserCreateRequest;
import com.noirix.domain.Car;
import com.noirix.domain.User;
import com.noirix.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cars") //all methods mapping will start with /users
@RequiredArgsConstructor
public class CarController {

    public final CarService carService;

    public static final String CAR_PAGE = "cars";
    public static final String CARS_LIST_ATTRIBUTE = "cars";

    // /cars
    @GetMapping
    public ModelAndView getAllCars() {
        ModelAndView result = new ModelAndView();

        result.setViewName(CAR_PAGE);
        result.addObject(CARS_LIST_ATTRIBUTE, carService.findAll());

        return result;
    }


    @GetMapping("/create")
    public ModelAndView getCarCreateRequest() {
        ModelAndView result = new ModelAndView();

        result.setViewName("createcar");
        result.addObject("carCreateRequest", new CarCreateRequest());

        return result;
    }

    //  /cars/search
    // Query params handling
    // 1)RequestParam
    // 2)ModelAttribute
    // 3)ModelMap and get query param by key from map

/*    @GetMapping(value = "/search")
    public ModelAndView search(ModelMap modelMap) {
        ModelAndView result = new ModelAndView();
        String resultQuery = StringUtils.isNotBlank((String)modelMap.get("query")) ? (String)modelMap.get("query") : "Sasha";
        Long resultLimit = (Long)modelMap.get("limit") != null ? (Long)modelMap.get("limit") : 100;
        result.setViewName(CAR_PAGE);
        result.addObject(CARS_LIST_ATTRIBUTE, carService.search(resultQuery).stream().limit(resultLimit).collect(Collectors.toList()));
        return result;
    }*/

    @GetMapping(value = "/search")
    public ModelAndView search(@ModelAttribute SearchCriteria criteria) {

        ModelAndView result = new ModelAndView();

        result.setViewName(CAR_PAGE);
        result.addObject(CARS_LIST_ATTRIBUTE, carService.search(criteria.getQuery()).stream().limit(criteria.getLimit()).collect(Collectors.toList()));

        return result;
    }

    //   /users/1
    @GetMapping(value = "/{id}")
    public ModelAndView search(@PathVariable("id") Long userId) {
        ModelAndView result = new ModelAndView();

        result.setViewName(CAR_PAGE);
        result.addObject(CARS_LIST_ATTRIBUTE, Collections.singletonList(carService.findById(userId)));

        return result;
    }

    @PostMapping
    public ModelAndView createCar(@ModelAttribute CarCreateRequest carCreateRequest) {

        //converters
        Car car = new Car();
        car.setPrice(carCreateRequest.getPrice());
        car.setModel(carCreateRequest.getModel());
        car.setColor(carCreateRequest.getColor());
        car.setCreation(carCreateRequest.getCreation());
        carService.save(car);

        ModelAndView result = new ModelAndView();

        result.setViewName(CAR_PAGE);
        result.addObject(CARS_LIST_ATTRIBUTE, Collections.singletonList(carService.findAll()));

        return result;
    }


}