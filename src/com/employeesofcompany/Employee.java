
/*Write a Java program that creates a class hierarchy for employees of a company. The base class
should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should
have properties such as name, address, salary, and job title. Implement methods for calculating
bonuses, generating performance reports, and managing projects.*/

package com.employeesofcompany;



public class Employee {
	
	protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void calculateBonus() {
        // Base bonus calculation logic
        double bonus = salary * 0.1; // 10% of salary
        System.out.println("Bonus for " + name + ": $" + bonus);
    }

    public void generatePerformanceReport() {
        // Base performance report logic
        System.out.println("Performance report for " + name + "...");
        // Generate and print performance report
    }



}
