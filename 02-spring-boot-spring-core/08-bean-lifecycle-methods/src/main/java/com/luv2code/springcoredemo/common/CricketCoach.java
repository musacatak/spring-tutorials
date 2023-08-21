package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    @PostConstruct
    public void onPostConstruct(){
        System.out.println("OnPostConstruct " + getClass().getSimpleName());
    }

    @PreDestroy
    public void onPreDestroy(){
        System.out.println("OnPreDestroy " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){

        return "Practise fast bowling for 15 minutes !!!!!!";
    }
}
