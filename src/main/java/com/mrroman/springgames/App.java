package com.mrroman.springgames;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mrroman.springgames.domain.Player;
import com.mrroman.springgames.service.ConsolePlayerPresenter;
import com.mrroman.springgames.service.PlayerPresenter;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext applCtx = fromXml();
//		ApplicationContext applCtx = fromAnnotations();
		
		PlayerPresenter playerPresenter = applCtx.getBean(ConsolePlayerPresenter.class);
		Player player = new Player();
		player.setName("Konrad");
		player.setSurname("Mrożek");
		player.setAge(32);
		player.setEmail("konrad.mrozek@gmail.com");
		playerPresenter.present(player);
	}

	private static ApplicationContext fromAnnotations() {
		 AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		 annotationConfigApplicationContext.register(Config.class);
		 return annotationConfigApplicationContext;
	}

	private static ApplicationContext fromXml() {
		return new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
}
