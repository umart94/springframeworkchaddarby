package springframeworkdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springframeworkdemo.config.SpringCustomConfiguration;
import springframeworkdemo.services.Coach;


public class Application {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCustomConfiguration.class);
	Coach theCoach = context.getBean("getCoachBean",Coach.class);
System.out.println(theCoach.getCoachDetails());
System.out.println(theCoach.getDailyWorkout());
}
}
