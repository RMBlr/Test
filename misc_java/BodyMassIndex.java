package com.makotojava.random;

import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] Resh) {
		boolean gender = false;
		// String gender;
		double weight, weight1;
		double height, height1;
		double bodyMassIndex;

		Scanner input = new Scanner(System.in);
		System.out.println("Are you a Male or Female" + "\n" + "true for male false for female ");
		boolean b = input.nextBoolean();

		if (b == true) {

			System.out.println("Enter Weight in pound");
			weight = input.nextFloat();
			weight1 = weight / 2.2;

			System.out.println("Enter height in feets");
			height = input.nextFloat();
			height1 = height / 3.048;

			bodyMassIndex = (weight1 / height1) / height1;
			System.out.println(bodyMassIndex);

			if (bodyMassIndex < 18.5) {
				System.out.println("Under weight");

			} else if (bodyMassIndex > 18.5 && bodyMassIndex < 24.9) {
				System.out.println("Normal");
				
			} else if (bodyMassIndex >= 25 && bodyMassIndex < 29.9) {
				System.out.println("Over weight");
				
			} else if (bodyMassIndex >= 30) {
				System.out.println("Obese");
			}
		}

	

		
{	System.out.println("Enter Weight in pound");
			weight = input.nextFloat();
			weight1 = weight / 2.2;
			
			System.out.println("Enter height in feets");
			height = input.nextFloat();
			height1 = height / 3.048;
			
			bodyMassIndex = (weight1 / height1) / height1;
			System.out.println(bodyMassIndex);

			if (bodyMassIndex < 16.5) {
				System.out.println("Under weight");
				
			} else if (bodyMassIndex > 16.5 && bodyMassIndex < 23.9) {
				System.out.println("Normal");
				
			} else if (bodyMassIndex >= 24 && bodyMassIndex < 27.9) {
				System.out.println("Over weight");
				
			} else if (bodyMassIndex >= 28) {
				System.out.println("Obese");
			}}
}}
		
	
