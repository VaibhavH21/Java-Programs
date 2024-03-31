package com.employeesofcompany;

public class Developer extends Employee  {
	
	private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        // Developer specific code writing logic
        System.out.println(name + " is writing code in " + programmingLanguage + "...");
    }

}
