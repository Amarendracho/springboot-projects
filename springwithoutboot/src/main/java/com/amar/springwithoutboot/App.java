package com.amar.springwithoutboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
    	Hospital h = (Hospital) context.getBean("hospital");
    	
    	ChildranHospital c = (ChildranHospital) context.getBean("childran");
    	System.out.println(c);
    	h.patientDepartment();
    	
    }
}
 