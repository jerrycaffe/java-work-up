package com.jerry.springdemo;


import org.springframework.stereotype.Component;

//spring will scan all codes and register all components
@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune(){
        return "Today is my lucky day!";
    }

}
