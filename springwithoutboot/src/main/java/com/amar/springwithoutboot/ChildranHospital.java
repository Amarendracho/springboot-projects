package com.amar.springwithoutboot;

public class ChildranHospital {
	
	private String parientName = "Mark Sloan";
	
	public ChildranHospital() {
		System.out.println("CHILDRAN HOSPITAL");
	}
	
	//CONSTRUCTOR INJECTION
	public ChildranHospital(String parientName) {
		this.parientName = parientName;
	}

} 
