package springframeworkdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springframeworkdemo.services.Coach;
import springframeworkdemo.services.CoachDetailsService;
import springframeworkdemo.services.MessageService;
import springframeworkdemo.services.impl.CoachDetailsServiceImpl;
import springframeworkdemo.services.impl.SimpleMessageService;
import springframeworkdemo.services.impl.SwimCoach;

@Configuration
public class SpringCustomConfiguration {

	@Bean
	public CoachDetailsService getCoachDetailsBean() {
		return new CoachDetailsServiceImpl();
	}
	@Bean
	public MessageService getMessageServiceBean() {
		return new SimpleMessageService();
	}
	
	@Bean
	public Coach getCoachBean() {
		return new SwimCoach(getMessageServiceBean(),getCoachDetailsBean());
	}
}
