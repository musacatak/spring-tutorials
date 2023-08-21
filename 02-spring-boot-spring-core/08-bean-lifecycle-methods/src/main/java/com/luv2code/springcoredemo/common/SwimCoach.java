package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "GO 10 Lap Swim";
    }

}
