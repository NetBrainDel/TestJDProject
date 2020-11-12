package com.noirix;

import com.noirix.domain.Car;
import com.noirix.domain.Gender;
import com.noirix.domain.User;
import com.noirix.service.CarService;
import com.noirix.service.UserService;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//@Slf4j
//@Log4j
public class SpringContextTester {
        private static final Logger log = Logger.getLogger(SpringContextTester.class);

        private static final Logger log1 = Logger.getLogger(SpringContextTester.class);


    public static void main(String[] args) {


        AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext("com.noirix");

        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);

        log.info(userService.findAll().stream().map(User::getUsername).collect(Collectors.joining(", ")));

        log.info(userService.findById(17L).toString());

        List<User> sasha = userService.search("sasha");

    for (User user : sasha) {
        log.info(user.toString());
    }

                User userForSave =
                User.builder()
                        .username("sasha")
                        .surname("tsy")
                        .birthDate(new Date())
                        .created(new Timestamp(new Date().getTime()))
                        .changed(new Timestamp(new Date().getTime()))
                        .gender(Gender.MALE)
                        .weight(81F)
                        .country("Poland")
                        .build();
        log.info(userService.save(userForSave).toString());

//}
//        AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext("com.noirix");
//        DatabaseConfig bean = annotationConfigApplicationContext.getBean(DatabaseConfig.class);
//
//        System.out.println(bean.getLogin());
//        System.out.println(bean.getDriverName());
//        System.out.println(bean.getPassword());
//        System.out.println(bean.getUrl());
//        System.out.println(bean.getTest());
////Check
////    for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
////
////      System.out.println(beanDefinitionName);
////    }
//
//        Car generatedCar = annotationConfigApplicationContext.getBean(Car.class);
//        System.out.println(generatedCar);
//
//
//        UserRepository userRepository = annotationConfigApplicationContext.getBean(UserRepository.class);
//        System.out.println(userRepository.findAll().stream().map(User::getUsername).collect(Collectors.joining(", ")));
//
//        CarRepository carRepository = annotationConfigApplicationContext.getBean(CarRepository.class);
//        System.out.println(carRepository.findAll().stream().map(Car::getModel).collect(Collectors.joining(", ")));
//
//
//    }}



//public class SpringContextTester {
//    private static final Logger log = Logger.getLogger(SpringContextTester.class);
//    private static final Logger log1 = Logger.getLogger(SpringContextTester.class);
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.noirix");
//
//        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
//
//        log.info(userService.findAll().stream().map(User::getUsername).collect(Collectors.joining(", ")));
//
//        log.info(userService.findById(8L).toString());
//
//        List< User> testCreate = userService.search("TestCreate");
//
//        for (User user : testCreate) {
//            log.info(user.toString());
//        }
//
//        User userForSave =
//                User.builder()
//                        .username("sasha")
//                        .surname("tsy")
//                        .birthDate(new Date())
//                        .created(new Timestamp(new Date().getTime()))
//                        .changed(new Timestamp(new Date().getTime()))
//                        .gender(Gender.MALE)
//                        .weight(81F)
//                        .country("Poland")
//                        .login("tsy1")
//                        .build();
//
//        log.info(userService.save(userForSave).toString());
//
//

        AnnotationConfigApplicationContext annotationConfigApplicationContexts= new AnnotationConfigApplicationContext("com.noirix");

        CarService carService = annotationConfigApplicationContexts.getBean(CarService.class);

        log1.info(carService.findAll().stream().map(Car::getModel).collect(Collectors.joining(", ")));

        log1.info(carService.findById(11L).toString());

        List <Car> sasha1 = carService.search("sasha1");

        for (Car car : sasha1) {
            log1.info(car.toString());
        }

        Car carForSave =
                Car.builder()
                        .model("mers")
                        .guarantee_expiration_date(new Timestamp(new Date().getTime()))
                        .price(2.0)
                        .color("red")
                        .creation(new Timestamp(new Date().getTime()))
                        .capacity_l(2.0)
                        .country_of_creation("Germany")
                        .dealer_id(2L)
                        .build();

        log1.info(carService.save(carForSave).toString());

    }
}

