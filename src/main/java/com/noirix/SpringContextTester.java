package com.noirix;

import com.noirix.domain.Car;
import com.noirix.domain.Gender;
import com.noirix.domain.User;
import com.noirix.service.CarService;
import com.noirix.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//@Slf4j
public class SpringContextTester {
    private static final Logger log = Logger.getLogger(SpringContextTester.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.noirix");

        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
        CarService carService = annotationConfigApplicationContext.getBean(CarService.class);


        log.info(userService.findAll().stream().map(User::getUsername).collect(Collectors.joining(", ")));
        log.info(carService.findAll().stream().map(Car::getModel).collect(Collectors.joining(", ")));

        log.info(userService.findById(11L).toString());
        log.info(carService.findById(11L).toString());


        List< User> testCreate = userService.search("TestCreate");
        List <Car> testCreate1 = carService.search("TestCreate1");

        for (User user : testCreate) {
            log.info(user.toString());
        }

        User userForSave =
                User.builder()
                        .username("Viachaslau")
                        .surname("Kalevich")
                        .birthDate(new Date())
                        .created(new Timestamp(new Date().getTime()))
                        .changed(new Timestamp(new Date().getTime()))
                        .gender(Gender.MALE)
                        .weight(90f)
                        .build();

        log.info(userService.save(userForSave).toString());


        for (Car car : testCreate1) {
            log.info(car.toString());
        }

        Car carForSave =
                Car.builder()
                        .model("mers")
                        .guarantee_expiration_date(new Timestamp(new Date().getTime()))
                        .price(2.0)
                        .color("red")
                        .creation(new Timestamp(new Date().getTime()))
                        .capacity_i(2.0)
                        .country_of_creation("Germany")
                        .build();

        log.info(carService.save(carForSave).toString());
        //Add search method to service
        //Realise search method with JDBCTemplate or NamedParamJDBCTemplate
    }
}
