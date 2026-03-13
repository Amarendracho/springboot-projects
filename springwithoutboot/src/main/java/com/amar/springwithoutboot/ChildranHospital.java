package com.amar.springwithoutboot;

public class ChildranHospital {

	private String patientName;
	private int patientAge;

	// GETTERS AND SETTERS
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;

	}

	public int getPatientAge() {
		return patientAge;
	}

	// private Hospital hospital;

	public ChildranHospital() {
		System.out.println("CHILDRAN HOSPITAL");
	}

	// CONSTRUCTOR INJECTION
	public ChildranHospital(String parientName) {
		this.patientName = parientName;
		System.out.println("CHILDRAN HOSPITAL PARAMETERIZED CONSTRUCTION");
	}




}
