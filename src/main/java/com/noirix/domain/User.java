
package com.noirix.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import javax.inject.Inject;
import javax.inject.Named;
import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
  /*Here we will store PK of m_users table*/
  private Long id;

  private String username;

  private String surname;

  private Date birthDate;

  private Gender gender = Gender.NOT_SELECTED;

  private Timestamp created = new Timestamp(System.currentTimeMillis());

  private Timestamp changed = new Timestamp(System.currentTimeMillis());

  private String country;

  private Float weight;


//  @Autowired
//  @Qualifier("getCar")
//   private Car userCar;
//
//  @Inject
//  @Named("getCar1") //@Primary     ///№1
//  private Car userCar;
//
//  @Autowired
//private  void setUserCar(@Qualifier("getCar1") Car userCar){ ////№3
//  this.userCar = userCar;
//}
//
//  @Autowired
//  public User(Car userCar){ ////№2 \\\№1(constructor)
//    this.userCar = userCar;
//  }

}
