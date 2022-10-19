package springframeworkdemo.services.impl;

import springframeworkdemo.services.Coach;
import springframeworkdemo.services.CoachDetailsService;
import springframeworkdemo.services.MessageService;

public class SwimCoach implements Coach{

	private MessageService messageService;
	private CoachDetailsService coachDetailsService;
	
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
		return messageService.getMessage();
	}

	public String getCoachDetails() {
		// TODO Auto-generated method stub
		return coachDetailsService.getCoachDetails();
	}

}
