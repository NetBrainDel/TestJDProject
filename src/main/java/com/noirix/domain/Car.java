package com.noirix.domain;

import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.security.Timestamp;

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

  private Timestamp guarantee;

  private Double price;

  private String color;

  private Integer creation;

  private Double Capacity_i;

  private String Country_of_creation;

  private Long dealerId;

  private Long userId;

  private int year;

  private String country;

}
