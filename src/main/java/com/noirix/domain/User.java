package com.noirix.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@EqualsAndHashCode
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

  private Timestamp created;

  private Timestamp changed;

  private Float weight;


  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }

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
