package com.example.interfacetest;

public class Chase implements Bank {

double rate =10.5d;
	public double calculateinterest(double amount, int year)
	{
		 double calculaterinterst=(amount*year*rate/100);
		return calculaterinterst;
	}}
