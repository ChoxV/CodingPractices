package com.gsv.lab2;

import java.util.Scanner;

class ParkingGarage
{ int hoursParked;
	ParkingGarage(int hoursParked){
		this.hoursParked = hoursParked;
	}
	 public double calculateCharge(int hoursParked) {
	        double charge = 2.00; // Minimum fee for up to 3 hours
	        
	        if (hoursParked > 3) {
	            charge += (hoursParked - 3) * 0.50; // Additional charge for hours over 3
	        }

	        // Cap the charge at $10.00
	        if (charge > 10.00) {
	            charge = 10.00;
	        }

	        return charge;
	    }
}

public class ParkingFeeCalculator {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ParkingGarage garage = new ParkingGarage();
		
		System.out.println("Enter the number of customer: ");
		int customers = in.nextInt();
		
		double totalCharges = 0.0;
		for(int i=1;i<=customers;i++)
		{
			System.out.println("Enter hours parked for customer "+i+": ");
			int hoursParked = in.nextInt();
			
			double charge = garage.calculateCharge(hoursParked);
			totalCharges +=charge;
		}
		System.out.println("\nTotal charges for all customer: $"+totalCharges);
	}
}