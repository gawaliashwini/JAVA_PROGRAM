/*
 Write a program to check positive or negative 
 */

package com.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number: "+n);
		}
		else
		{
			System.out.println("Negative Number: "+n);
		}
	}

}
