/*
 Write a program to program to calculate factorial of number 
 */
package com.loops;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,fact=1;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number:"+fact);
	}

}
