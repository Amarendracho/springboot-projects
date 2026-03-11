package com.amar.springwithoutboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
    	Hospital h = context.getBean(Hospital.class);
    	h.patientDepartment();
    	

    }
}
