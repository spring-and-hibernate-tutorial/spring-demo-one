package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach otherCoach = context.getBean("myOtherCoach", Coach.class);
		Coach fieldCoach = context.getBean("myFieldCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(otherCoach.getDailyWorkout());
		System.out.println(fieldCoach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
