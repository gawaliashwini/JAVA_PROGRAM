/*
 write a program to check even or odd number
 */

package com.decisionmaking;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even number: "+n);
		}
		else
		{
			System.out.println("Odd Number: "+n);
		}
	}

}
