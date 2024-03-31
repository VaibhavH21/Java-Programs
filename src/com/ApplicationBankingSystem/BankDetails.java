
/*Create a menu driven mini-application for a banking system in Java.
 *  Add some basic functionalities
of a bank account like a deposit of amount, withdrawal of amount, etc.
Menu -
i)Display all account details
ii)Search by account number
iii)Deposit the amount
iv)Withdraw the amount
v)Exit*/

package com.ApplicationBankingSystem;

import java.util.Scanner;

public class BankDetails {
	
	private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
      
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
     
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + ""
            		+ "\tTransaction failed...!!" );  
        }  
    }  
     
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
