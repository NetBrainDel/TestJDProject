
package com.noirix.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Configuration("application.yml")
@ConfigurationProperties("amazon.images")

public class AmazonConfig {

  private String s3;

  private String token;

  private String password;

  List<String> amazon = new ArrayList<>(){
    private String s3;

    private String token;

    private String password;
  };

    }



