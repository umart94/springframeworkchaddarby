package springdemo;

public class BaseballCoach implements Coach{

	//private MessageService messageService;
	
	
	/*public BaseballCoach(MessageService theMessageService) {
		messageService = theMessageService;
	}*/
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "baseball workout";
	}

	/*@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return messageService.getMessage();
	}*/

}
