package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		
		// create another object and use it
		Coach otherCoach = new TrackCoach();
		System.out.println(otherCoach.getDailyWorkout());

	}

}
