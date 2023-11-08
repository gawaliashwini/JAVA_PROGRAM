/*
  Read a digit and display a spelling
 */

package com.switchcase;

import java.util.Scanner;

public class DigitDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit: ");
		int d=sc.nextInt();
		switch(d)
		{
			case 1:
			System.out.println("One");
			break;
			
			case 2:
			System.out.println("Two");
			break;
			
			case 3:
			System.out.println("Three");
			break;
				
			case 4:
			System.out.println("Four");
			break;
			
			case 5:
			System.out.println("Five");
			break;
			
			case 6:
			System.out.println("Six");
			break;
				
			default:
			System.out.println("Other day");
		}	
		
	}

}
