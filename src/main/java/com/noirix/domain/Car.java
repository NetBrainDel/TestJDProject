package com.noirix.domain;

import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.sql.Timestamp;
import java.util.Date;

//DATA
@Setter
@Getter
@EqualsAndHashCode
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

  private Long id;

  private String model;

  private Timestamp guarantee_expiration_date;

  private Double price;

  private String color;

  private Date creation;

  private Double capacity_l;

  private String country_of_creation;

  private Long dealer_id;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }

}
