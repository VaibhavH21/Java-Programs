/*Write a program in Java to calculate the average of three subjects and display total and average
marks.*/

package com.calculateaverage;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter marks for Three Subject  ");
		System.out.println("Subject 1: ");
		double subject1 = scanner.nextDouble();
		
		System.out.println("Subject 2: ");
		double subject2 = scanner.nextDouble();
		
		System.out.println("Subject 3: ");
		double subject3 = scanner.nextDouble();
		
		double totalMarks = subject1 + subject2 + subject3;
		
		double averageMarks = totalMarks / 3.0;
		
		System.out.println("Total marks : " + totalMarks);
		System.out.println("Average marks : " + averageMarks);
		
		scanner.close();
		
		
	}

}
