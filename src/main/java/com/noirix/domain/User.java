
package com.noirix.domain;

import lombok.*;
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

  private Float weight;



    }
