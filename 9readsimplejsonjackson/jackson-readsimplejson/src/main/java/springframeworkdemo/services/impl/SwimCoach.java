package springframeworkdemo.services.impl;

import org.springframework.beans.factory.annotation.Value;

import springframeworkdemo.services.Coach;
import springframeworkdemo.services.CoachDetailsService;
import springframeworkdemo.services.MessageService;

public class SwimCoach implements Coach{

	private MessageService messageService;
	private CoachDetailsService coachDetailsService;
	
	
	@Value("${umartariq.email}")
	private String email;
	@Value("${umartariq.password}")
	private String password;
	
	public SwimCoach(MessageService messageService, CoachDetailsService coachDetailsService) {
		super();
		this.messageService = messageService;
		this.coachDetailsService = coachDetailsService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swimming";
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return messageService.getMessage()+email+password;
	}

	public String getCoachDetails() {
		// TODO Auto-generated method stub
		return coachDetailsService.getCoachDetails();
	}

	public String getEmail() {
		return email;
	}

	

	public String getPassword() {
		return password;
	}

	

}
