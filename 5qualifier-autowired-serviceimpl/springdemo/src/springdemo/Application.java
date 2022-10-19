package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("trackCoach",Coach.class);//default name of bean is small case first letter then camelCase 2nd word.
		System.out.println(coach.getMessage());
		//System.out.println(coach.getCoachDetails());
		}
}
