/*
 * Read a number as many as user wants check palindrome or not. 
 */
package com.pattern;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num,d,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		if(sum==num)
			System.out.println("Palindrome number");
		else
			System.out.println("Not palindrome number");
	}

}
