package com.noirix.controller.request;

import lombok.Data;
import java.util.Date;


@Data
public class CarCreateRequest {

    private String model;

    private Double price;

    private String color;

    private Date creation;

    private Double capacity_l;

    private Long dealer_id;
}
