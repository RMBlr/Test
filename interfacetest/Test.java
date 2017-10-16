package com.example.interfacetest;

import java.util.Scanner;

public class Test {
	public static void main(String[] arg) {
		
int select;
Scanner in = new Scanner(System.in);
System.out.println("Enter 1 for BofA"   +"\n "   + "Enter 2 for CapitolOne"+"\n"+"Enter 3 for Chasebank");
select=in.nextInt();
switch (select){
	case 1 : 

			{Scanner input = new Scanner(System.in);
			System.out.println("Enter the Principal for BofA : ");
			double amount = input.nextDouble();
			System.out.println("Enter the number of years : ");
			int term = input.nextInt();
			/*System.out.println("Enter the rate : ");
			double percentage = input.nextDouble();*/

			Bank b = new BofA();
			double interest = b.calculateinterest(amount, term);
			double total = interest+amount;
			//double total = b.calculateTotalAmount(amount, term, percentage);

			
			System.out.println("Interest is " + interest + " and the total amount is " + total);}
		
	break;
		
case 2:

			{Scanner input = new Scanner(System.in);
			System.out.println("Enter the Principal for CapitolOne : ");
			double amount = input.nextDouble();
			System.out.println("Enter the number of years : ");
			int term = input.nextInt();
			/*System.out.println("Enter the rate : ");
			double percentage = input.nextDouble();*/

			Bank b = new CapitalOne();
			double interest = b.calculateinterest(amount, term);
			double total = interest+amount;
			//double total = b.calculateTotalAmount(amount, term, percentage);

			
			System.out.println("Interest is " + interest + " and the total amount is " + total);}
		break;
case 3:

{	Scanner input =new Scanner(System.in);
			System.out.println("Enter the amount for Chase");
			double amount = input.nextDouble();
			
			System.out.println("Enter the number of years :");
			int term = input.nextInt();
			
			/*System.out.println("Enter the rate");
			double percentage =input.nextDouble();*/
			
			Bank b= new Chase();
			double interest = b.calculateinterest(amount, term );
			double total =interest+amount;
			System.out.println("Interest is " + interest + " and the total amount is " + total);
break;
		}
	}

	}}
