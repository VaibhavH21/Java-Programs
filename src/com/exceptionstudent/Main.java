package com.exceptionstudent;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        
        try {
        	
        	 if (marks < 0 || marks > 100) {
                 throw new MarksOutOfBoundException("Marks out of Bound: Marks should be between 0 and 100.");
        	 }
             System.out.println("Roll Number: " + rollNo);
             System.out.println("Marks: " + marks);
        	 }catch (MarksOutOfBoundException e) {
			
			System.err.println("Error: " + e.getMessage());
			
		}
          
	}    
        
	
}	

