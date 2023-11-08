/*
 Write a program to check palindrome or not 
 */
package com.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,d,sum=0,a;
		System.out.println("Enter the number");
		n=sc.nextInt();
		a=n;
		while(n>0)
		{
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		if(sum==a)
			System.out.println("Palindrome number");
		else
			System.out.println("Not an palindrome number");
	}

}
