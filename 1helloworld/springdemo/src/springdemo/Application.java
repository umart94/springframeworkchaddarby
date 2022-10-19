package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("baseballCoachBean",Coach.class);
		Coach coach2 = context.getBean("trackCoachBean",Coach.class);
		//coach.getMessage();
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
	}
}
