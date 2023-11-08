/*
 Write a program to calculate the sum of cube of digits 
 */
package com.loops;

import java.util.Scanner;

public class SumOfCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,d,c,sum=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n>0) {
			d=n%10;
			c=d*d*d;
			sum=sum+c;
			n=n/10;
		}
		System.out.println("Sum of Cube of Digits:"+sum);
	}

}
