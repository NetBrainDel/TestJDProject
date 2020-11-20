package com.noirix.controller;

import com.noirix.config.AmazonConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/info") //all methods mapping will start with /info
@RequiredArgsConstructor
public class TestController {

    @GetMapping
    public ModelAndView getAllInfo() {
        ModelAndView result = new ModelAndView();

        result.setViewName(String.valueOf(AmazonConfig.class));

        return result;
    }

}