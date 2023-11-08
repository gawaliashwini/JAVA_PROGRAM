/*
 A library charges as follows
 
 	number of days let                         Fine
 	
 	5 - 10                                     10 rupees
 	11 - 20                                    20 rupees
 	21 -31                                     50 rupees
 	greater than 30                            Membership cancel
 	Write a program to read number of days let to written by student and display fine
 */
package com.switchcase;

import java.util.Scanner;

public class BookFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of days: ");
		int d=sc.nextInt();
		if(d>=1 && d<=4)
			System.out.println("No Fine");
		else if(d>=5 && d<=10)
			System.out.println("Fine is 10 Rupees");
		else if(d>=11 && d<=20)
			System.out.println("Fine is 20 Rupees");
		else if(d>=21 && d<=30)
			System.out.println("Fine is 50 Rupees");
		else
			System.out.println("Membership cancel");
	}

}
