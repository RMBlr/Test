package com.example.interfacetest;

public class BofA implements Bank {
	
	
	double rate = 10.00d;

	public double calculateinterest(double amount, int year) {
	
		double calculateinterest = (amount * year * rate / 100);
		return calculateinterest;
	}

	
	
}
/*public double calculateTotalAmount(double amount, int year, double rate) {
double totalAmount = amount + this.calculateinterest(amount, year, rate);
return totalAmount;
}*/