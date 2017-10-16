package com.example.interfacetest;

public class CitiBank implements Bank {
double rate =13.2;

		public double calculateinterest(double amount, int year)
		{
			 double calculaterinterst=(amount*year*rate/100);
			return calculaterinterst;
		}


	}



