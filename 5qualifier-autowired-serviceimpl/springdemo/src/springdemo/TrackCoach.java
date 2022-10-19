package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	
	private MessageService messageService;
	private CoachDetailsService coachDetailsService;
	
	
	
	
	
	public TrackCoach() {}
	
	@Autowired
	public TrackCoach(@Qualifier("simpleMessageService") MessageService messageService,CoachDetailsService coachDetailsService) {
		super();
		this.messageService = messageService;
		this.coachDetailsService = coachDetailsService;
	}

	/*@Autowired
	public TrackCoach(@Qualifier("simpleMessageService") MessageService messageService, CoachDetailsService coachDetailsService
			,@Qualifier("messageServiceImplementationSecond") MessageService messageServiceSecond
			,@Qualifier("messageServiceImplementationThird") MessageService messageServiceThird) {
		super();
		this.messageService = messageService;
		this.coachDetailsService = coachDetailsService;
		this.messageServiceSecond = messageServiceSecond;
		this.messageServiceThird = messageServiceThird;
	}*/




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

	//@Override
	//public String getCoachDetails() {
		// TODO Auto-generated method stub
		//return coachDetailsService.getCoachDetails();
	//}

}
