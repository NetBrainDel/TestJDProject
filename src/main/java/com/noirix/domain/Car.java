package com.noirix.domain;

import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

//DATA
@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

  private Long id;

  private String model;

  private Timestamp guaranteeExpirationDate;

  private Double price;

  private String color;

  private Date creation;

  private Double capacityL;

  private String countryOfCreation;


}
