package springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SimpleMessageService implements MessageService{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Simple message service implementation - umar";
	}

}
