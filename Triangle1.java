/*
 Write to read three angles of triangles and check whether the triangle is valid or not.
 */

package com.decisionmaking;

import java.util.Scanner;

public class Triangle1 {
	public static void main(String[] args) {
		System.out.println("Enter the angles Of Triangles: ");
		Scanner sc=new Scanner(System.in);
		int a,b,c,n;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		n=a+b+c;
		if(n==180)
		{
			System.out.println("Triangle is valid");
		}
		else {
			System.out.println("Triagle is invalid!");
		}
	}
}
