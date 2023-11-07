/*
 Read Three number display maximum number using nested if 
 */

package com.decisionmaking;

import java.util.Scanner;

public class NestIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println("Maximum: "+a);
			else
				System.out.println("Maximum: "+c);
		}
		else
		{
			if(b>c)
				System.out.println("Maximum: "+b);
			else
				System.out.println("Maximum: "+c);
		}
	
	}

}
