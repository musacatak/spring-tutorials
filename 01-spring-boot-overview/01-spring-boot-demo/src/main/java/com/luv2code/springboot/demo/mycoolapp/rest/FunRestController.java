package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        System.out.println("Hello");
        return coachName + " " + teamName ;
    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

}

