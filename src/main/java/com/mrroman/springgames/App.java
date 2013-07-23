package com.mrroman.springgames;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext applCtx = fromXml();
//		ApplicationContext applCtx = fromAnnotations();
	
		applCtx.
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
