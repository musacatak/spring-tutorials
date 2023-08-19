package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BunRestController {
    @GetMapping("/bun")
    public String sayHello() {
        System.out.println("Hello");
        return coachName + " " + teamName ;
    }

    @GetMapping("/work")
    public String workHard() {
        System.out.println("Workout");
        return "Workout" + " " + teamName ;
    }

    @GetMapping("/hard")
    public String hardWork() {
        System.out.println("hard");
        return "hard" + " " + teamName ;
    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

}