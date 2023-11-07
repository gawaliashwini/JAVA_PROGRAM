/*
 Read a number check positive, negative or zero 
 */

package com.decisionmaking;

import java.util.Scanner;

public class ElseIfDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number");
		}
		else if(n<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
