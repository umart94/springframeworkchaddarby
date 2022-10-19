package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	
	private MessageService messageService;
	private CoachDetailsService coachDetailsService;
	
	@Autowired
	public TrackCoach(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	public TrackCoach(MessageService messageService,CoachDetailsService coachDetailsService) {
		super();
		this.messageService = messageService;
		this.coachDetailsService = coachDetailsService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "track workout";
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
