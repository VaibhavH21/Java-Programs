package com.employeesofcompany;

public class Company {
	
	public static void main(String[] args) {
		
	        Manager manager = new Manager("John Doe", "123 Main St", 70000, "Manager");
	        Developer developer = new Developer("Jane Smith", "456 Elm St", 60000, "Developer", "Java");
	        Programmer programmer = new Programmer("Alice Johnson", "789 Oak St", 65000, "Programmer", "Python");

	        manager.calculateBonus();
	        developer.calculateBonus();
	        programmer.calculateBonus();
	        
	        manager.manageProjects();
	        developer.writeCode();
	        programmer.debugCode();
	    }

}
