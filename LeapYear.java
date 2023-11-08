/*
 Write a program to calculate leap year or not. 
 */

package com.decisionmaking;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y;
		System.out.println("Enter Year: ");
		y=sc.nextInt();
		if(y%4==0)
		{
			System.out.println("This Year is Leap");
		}
		else
		{
			System.out.println("This Year is Not Leap Year");
		}
	}

}
