package com.jerry.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.teram}")
    private String team;


    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
        @Override
    public String getDailyWorkout(){
        return "Swim 1000 meters as a warm up";
        }
        @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
        }
}
