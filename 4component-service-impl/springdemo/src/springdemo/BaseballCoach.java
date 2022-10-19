package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

	
	private MessageService messageService;
	
	private CoachDetailsService coachDetailsService;
	
	@Autowired
	public BaseballCoach(MessageService theMessageService) {
		messageService = theMessageService;
	}
	
	public BaseballCoach(MessageService messageService,CoachDetailsService coachDetailsService) {
		super();
		this.messageService = messageService;
		this.coachDetailsService = coachDetailsService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "baseball workout";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return messageService.getMessage();
	}

	@Override
	public String getCoachDetails() {
		// TODO Auto-generated method stub
		return coachDetailsService.getCoachDetails();
	}

}
