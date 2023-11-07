/*
 Write an program to read a number display it's cube of last digit
 */

package com.math;

import java.util.Scanner;

public class CubeLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,c,d;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		d=n%10;
		c=d*d*d;
		System.out.println("Cube of last Digit: "+c);
	}

}
