package com.employeesofcompany;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	
	 private List<String> managedProjects;

	    public Manager(String name, String address, double salary, String jobTitle) {
	        super(name, address, salary, jobTitle);
	        this.managedProjects = new ArrayList<>();
	    }

	    public void manageProjects() {
	        // Manager specific project management logic
	        System.out.println(name + " is managing projects...");
	        // Example: List out managed projects
	        for (String project : managedProjects) {
	            System.out.println(" - " + project);
	        }
	    }
	    
	    public void addProject(String projectName) {
	        managedProjects.add(projectName);
	    }
	    
	    public void removeProject(String projectName) {
	        managedProjects.remove(projectName);
	    }
	    

}
