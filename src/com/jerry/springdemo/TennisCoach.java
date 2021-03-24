package com.jerry.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component //this uses the default bean id which is the same name with the class
public class TennisCoach implements Coach{
    @Autowired //this is field injection, this is no constructor injection or field injection but just setup the field for me
    private FortuneService fortuneService;


//    define a default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }


//    define a setter method
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

   /* @Autowired //configuring the dependency injection with autowire annotation
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/
    @Override
    public  String getDailyWorkout(){
       return "Practice your backhand volley";
   }

   @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
   }

}
