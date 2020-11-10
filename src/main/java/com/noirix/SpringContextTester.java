package com.noirix;

import com.noirix.domain.Car;
import com.noirix.domain.Gender;
import com.noirix.domain.User;
import com.noirix.repository.CarRepository;
import com.noirix.repository.UserRepository;
import com.noirix.service.CarService;
import com.noirix.service.UserService;
import com.noirix.util.DatabaseConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//@Slf4j
public class SpringContextTester {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext("com.noirix");

        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);

        System.out.println(userService.findAll().stream().map(User::getUsername).collect(Collectors.joining(", ")));

    System.out.println(userService.findById(17L));

    System.out.println(userService.search("sasha"));

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
        System.out.println(userService.save(userForSave));
    }
}
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
//
//        CarService carService = annotationConfigApplicationContext.getBean(CarService.class);
//
//        log1.info(carService.findAll().stream().map(Car::getModel).collect(Collectors.joining(", ")));
//
//        log1.info(carService.findById(11L).toString());
//
//        List <Car> testCreate1 = carService.search("TestCreate1");
//
//        for (Car car : testCreate1) {
//            log1.info(car.toString());
//        }
//
//        Car carForSave =
//                Car.builder()
//                        .model("mers")
//                        .guarantee_expiration_date(new Timestamp(new Date().getTime()))
//                        .price(2.0)
//                        .color("red")
//                        .creation(new Timestamp(new Date().getTime()))
//                        .capacity_i(2.0)
//                        .country_of_creation("Germany")
//                        .build();
//
//        log1.info(carService.save(carForSave).toString());

//    }
//}
