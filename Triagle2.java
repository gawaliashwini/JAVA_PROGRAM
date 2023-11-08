/*
 Write a program to read three sides of triangle and check whether The triangle is equilateral, Isoscalen,scalen 
 */

package com.decisionmaking;

import java.util.Scanner;

public class Triagle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c,s;
		System.out.println("Enter the triangle sides:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=a+b+c;
		if(s==180)
		{
			System.out.println("Valid Triangle");
			if(a==b && b==c)
			{
				System.out.println("The triangle is equilateral");
			}
			else if(a==b || b==c || c==a)
			{
				System.out.println("The triangle is isoscalen");
			}
			else
			{
				System.out.println("The triangle is scalen");
			}
		}
		else
		{
			System.out.println("Triagle is invalid addition of all side must be 180");
		}
		
	}

}
