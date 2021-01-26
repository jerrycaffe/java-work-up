package jerry;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

//    this is the spring version of MyAppp main method
//    instead of creating objects ourselves spring is creating the object for us by setting application context . xml and by instantiating  class path here


    public static void main(String[] args) {

//        load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        retrive the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
//        call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
//        close the appliation context
        context.close();
    }


}
