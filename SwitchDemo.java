/*
 Write a program to read two numbers and choice to perform following operation to choice
 1. Maximum no
 2. Minimum no
 3. Average no 
 */

package com.switchcase;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,avg,ch;
		System.out.println("Enter Two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Choices are: \n 1. Maximum no\n2. Minimum no\n3. Average no \n");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				if(a<b)
					System.out.println("Maximum number: "+b);
				else
					System.out.println("Maximum number: "+a);
			break;
			
			case 2:
				if(a<b)
					System.out.println("Minimum number: "+a);
				else
					System.out.println("Minimum number: "+b);
			break;
			
			case 3:
				avg=(a+b)/2;
				System.out.println("Average Number: "+avg);
			break;
			
			default:
				System.out.println("Invalid choice");
		}
	}

}
