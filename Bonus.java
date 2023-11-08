/*
 A bank provides 2% bonus to its account holder in following cases
 1. If account holder is female with balance greater than 10000
 2. If account holder is male with balance greater than 15000
 3. In all other cases no bonus provided  
 Write a program to read gender and balances of account holder and check bonus given or not and how much?
 */

package com.switchcase;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String gen;
		double bal,bonus;
		System.out.println("Enter the balance: ");
		bal=sc.nextDouble();
		System.out.println("Enter the Gender: ");
		gen=sc.next();
		if(gen.equalsIgnoreCase("female")&& bal>=10000)
		{
			bonus=0.02*bal;
			System.out.println("Bonus provided: "+bonus);
		}
		else if(gen.equalsIgnoreCase("male")&& bal>=15000)
		{
			bonus=0.02*bal;
			System.out.println("Bonus provided: "+bonus);
		}
		else
			System.out.println("No bonus is provided");
	}

}
