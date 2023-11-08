/*
 write a  program to print sum of n natural number 
 */
package com.loops;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of numbers:"+sum);
	}

}
