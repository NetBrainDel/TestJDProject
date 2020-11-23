package com.noirix.controller;

import com.noirix.config.AmazonConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/amazon")
@RequiredArgsConstructor
public class TestRestController {

  public final AmazonConfig amazonConfig;

  @GetMapping
  public String findAllAmazon() {

    return "S3: "+amazonConfig.getS3()+'\n'+"Token: "+amazonConfig.getToken()+'\n'+"Password: "+amazonConfig.getPassword();
    // ResponseEntity.ok(amazonConfig)
  }
}