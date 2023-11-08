/*
  Read a number and display a month
 */

package com.switchcase;

import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.println("Enter The day(1 to ):");
		month=sc.nextInt();
		switch(month)
		{
		  case 1:
			  System.out.println("January");
		  break;
		  case 2:
			  System.out.println("February");
		  break;
		  case 3:
			  System.out.println("March");
		  break;
		  case 4:
			  System.out.println("April");
		  break;
		  case 5:
			  System.out.println("May");
		  break;
		  case 6:
			  System.out.println("June");
		  break;
		  case 7:
			  System.out.println("July");
		  break;
		  
		  default:
			  System.out.println("Other Month");
			
	}
	}
}
