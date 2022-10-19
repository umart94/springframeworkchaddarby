package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("merabean")
public class TrackCoach implements Coach{
	
	
	private MessageService messageService;
	private CoachDetailsService coachDetailsService;
	private MessageService messageServiceImpl2;
	
	
	
	
	
	@Autowired
	public TrackCoach(MessageService messageService,CoachDetailsService coachDetailsService,MessageService messageServiceImpl2) {
		super();
		this.messageService = messageService;
		this.coachDetailsService = coachDetailsService;
		this.messageServiceImpl2 = messageServiceImpl2;
		
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
