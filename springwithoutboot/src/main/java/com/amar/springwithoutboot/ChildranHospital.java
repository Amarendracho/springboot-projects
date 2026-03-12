package com.amar.springwithoutboot;

public class ChildranHospital {
	
	private String patientName;
	
	public ChildranHospital() {
		System.out.println("CHILDRAN HOSPITAL");
	}
	
	//CONSTRUCTOR INJECTION
	public ChildranHospital(String parientName) {
		this.patientName = parientName;
		System.out.println("CHILDRAN HOSPITAL");
	}
	
	//GETTERS AND SETTERS 
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String parientName) {
		this.patientName = parientName;
	}

} 
