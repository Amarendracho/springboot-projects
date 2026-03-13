package com.amar.springwithoutboot;

public class ChildranHospital {
	 
	 String patientName;
	 int patientAge;
	
	//private Hospital hospital;
	
	public ChildranHospital() { 
		System.out.println("CHILDRAN HOSPITAL");
	}
	
	//CONSTRUCTOR INJECTION
	public ChildranHospital(String parientName) {
		this.patientName = parientName;
		System.out.println("CHILDRAN HOSPITAL PARAMETERIZED CONSTRUCTION");
	} 
	 
	//GETTERS AND SETTERS 
//	public String getPatientName() {
//		return patientName;
//	}
//	
//	public void setPatientName(String parientName) {
//		this.patientName = parientName;
//	}
	
//	public ChildranHospital(Hospital hospital) {
//		this.hospital = hospital;
//	}

} 
