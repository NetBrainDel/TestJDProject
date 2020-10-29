package com.noirix.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Data
@NoArgsConstructor
@AllArgsConstructor
@PropertySource("classpath:database.properties")
//future bean name = databaseConfig
public class DatabaseConfigs {

    @Value("${driverName}") //SPEL - Spring Expression Language
    private String driverName;

    @Value("${url}")
    private String url;

    @Value("${login}")
    private String login;

    @Value("${password}")
    private String password;

}
