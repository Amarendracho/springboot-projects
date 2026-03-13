package com.amar.springwithoutboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		// Hospital h = (Hospital) context.getBean("hospital");

		ChildranHospital c = (ChildranHospital) context.getBean("childran");
		c.setPatientName("JORDON");
		c.setPatientAge(25);
		System.out.println(c.getPatientName());
		System.out.println(c.getPatientAge());

	}
}
