package springdemo;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImplementationThird implements MessageService{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "third message";
	}

}
