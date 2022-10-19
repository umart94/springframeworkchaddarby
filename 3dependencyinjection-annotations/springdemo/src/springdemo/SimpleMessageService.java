package springdemo;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageService implements MessageService{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "This is a simple message";
	}

}
