/*
 Write a program to read a number display its last digit. 
 */

package com.math;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,d;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		d=n%10;
		System.out.println("Last Digit of number="+d);
	}

}
