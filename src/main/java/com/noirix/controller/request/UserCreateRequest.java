package com.noirix.controller.request;

import com.noirix.domain.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class UserCreateRequest {
    private String username;

    private String surname;

    private String login;

    private String password;

    private Date birthDate;

    private Gender gender = Gender.NOT_SELECTED;

    private Float weight;


}