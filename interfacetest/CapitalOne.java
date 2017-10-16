package com.example.interfacetest;
 
	public class CapitalOne implements Bank {
double rate=12.5d;

		public double calculateinterest(double amount, int year)
		{
			 double calculaterinterst=(amount*year*rate/100);
			return calculaterinterst;
		}


	}



	
