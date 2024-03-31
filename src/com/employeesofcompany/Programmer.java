package com.employeesofcompany;

public class Programmer extends Developer {
	
	public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle, programmingLanguage);
    }

    public void debugCode() {
        // Programmer specific code debugging logic
        System.out.println(name + " is debugging code...");
    }
	

}
