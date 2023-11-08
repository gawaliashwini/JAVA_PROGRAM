/* 
 Read a number and display day of week
 */
package com.switchcase;

import java.util.Scanner;

public class day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int day;
		System.out.println("Enter The day(1 to 7):");
		day=sc.nextInt();
		switch(day)
		{
		  case 1:
			  System.out.println("Sunday");
		  break;
		  case 2:
			  System.out.println("Monday");
		  break;
		  case 3:
			  System.out.println("Tuesday");
		  break;
		  case 4:
			  System.out.println("Wednesday");
		  break;
		  case 5:
			  System.out.println("Thursday");
		  break;
		  case 6:
			  System.out.println("Friday");
		  break;
		  case 7:
			  System.out.println("Saturday");
		  break;
		  default:
			  System.out.println("Invalid Day");
			
		}
				
	}

}