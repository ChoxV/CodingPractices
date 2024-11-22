package com.gsv.lab2;

import java.util.Scanner;

class Customer
{
	private int accountNumber;
	private double beginningBalance;
	private double totalCharges;
	private double totalCredits;
	private double creditLimits;
	
	public Customer(int accountNumber,double beginningBalance,double totalCharges,double totalCredits,double creditLimit)
	{
		this.accountNumber = accountNumber;
		this.beginningBalance = beginningBalance;
		this.totalCharges = totalCharges;
		this.totalCredits = totalCredits;
		this.creditLimits = creditLimit;
	}
	
	public double calculateNewBalance()
	{
		return beginningBalance+totalCharges -totalCredits;
	}
	public boolean isCreditLimitExeeded()
	{
		return calculateNewBalance()>creditLimits;
	}
	public void displayAccountStatus()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("New Balance: $"+calculateNewBalance());
		if(isCreditLimitExeeded())
		{
			System.out.println("Credit Limit exceeded!");
		}
		else
		{
			System.out.println("Credit limit is within the allowed range.");
		}
	}
}

public class CustomerBalanceCalculator{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		
		System.out.print("Enter account number");
		int accountNumber = in.nextInt();
		System.out.print("Enter balance at the beginning of the month:");
		double begginningBalance = in.nextDouble();
		System.out.print("Enter total charges this month:");
		double totalCharges = in.nextDouble();
		System.out.print("Enter total credits applied this month:");
		double totalCredits = in.nextDouble();
		System.out.println("Enter credit limit:");
		double creditLimit = in.nextDouble();
		
		Customer customer = new Customer(accountNumber, begginningBalance, totalCharges, totalCredits, creditLimit);
		System.out.println("\nAccount Summary:");
		customer.displayAccountStatus();
	}
}
