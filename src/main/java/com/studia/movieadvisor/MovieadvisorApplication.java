package com.studia.movieadvisor;

import com.studia.movieadvisor.config.AppConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;


public class MovieadvisorApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MovieAdvisorRunApp runApp = applicationContext.getBean(MovieAdvisorRunApp.class);
		runApp.run(args);

		//SpringApplication.run(MovieadvisorApplication.class, args);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
