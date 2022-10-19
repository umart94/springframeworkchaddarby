package springdemo;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImplementationSecond implements MessageService{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Second message";
	}

}
