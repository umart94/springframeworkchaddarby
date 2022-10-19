package springframeworkdemo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;

import springframeworkdemo.model.Student;

public class Application {
public static void main(String[] args) {
	/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCustomConfiguration.class);
	Coach theCoach = context.getBean("getCoachBean",Coach.class);
System.out.println(theCoach.getCoachDetails());
System.out.println(theCoach.getDailyWorkout());
System.out.println(theCoach.getMessage());*/
	
	try {
		ObjectMapper mapper = new ObjectMapper();
		Resource resource = new ClassPathResource("sample-lite.json");
		Student student = mapper.readValue(resource.getFile(),Student.class);
		System.out.println(student);
	} catch (Exception e) {
		
	}
	
}
}
