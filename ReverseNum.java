/*
 Write a program to calculate the reverse of number 
 */
package com.loops;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated
		Scanner sc=new Scanner(System.in);
		int d,n,sum=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n>0)
		{
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		System.out.println("reverse number:"+sum);
	}
}
