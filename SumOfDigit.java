/*
 Write a program to calculate the sum of digits 
 */
package com.loops;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,d,sum=0;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum of digits:"+sum);
	}

}
