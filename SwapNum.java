/*
 Write a program to swap the integer using three variables 
 */

package com.math;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a: "+a+"b: "+b);
		System.out.println("After Swaping numbers");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a+"b: "+b);
	}

}