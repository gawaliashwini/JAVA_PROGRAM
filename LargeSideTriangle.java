/*
 Read Three Sides of triangle and check wheather the triangle is valid or not. If triangle is valid , if 
 sum of two sides is greater than larger side   
 */


package com.decisionmaking;

import java.util.Scanner;

public class LargeSideTriangle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sides of Triangle:");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
	    c=sc.nextInt();
	    if(a+b>c && c+b>a && a+c>b)
	    {
	    	System.out.println("Valid Triangle");
	    }
	    else
	    {
	    	System.out.println("Invalid Triangle");
	    }
	}
}
