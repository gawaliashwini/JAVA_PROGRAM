/*
 Write a program to read number and choice to perform following operation to choice
 1. Positive or negative
 2. even or odd
 3. Square
 4. cube 
 */

package com.switchcase;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sq,cb,n,ch;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		System.out.println("Choices are: \n 1. Positive or negative\n2. even or odd\n3. Square\n4. cube");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				if(n>0)
					System.out.println("Positive Number:"+n);
				else
					System.out.println("Negative Number:"+n);
			break;
			
			case 2:
				if(n%2==0)
					System.out.println("Even number:"+n);
				else
					System.out.println("Odd number:"+n);
			break;
			
			case 3:
				sq=n*n;
				System.out.println("Square:"+sq);
			break;
			
			case 4:
				cb=n*n*n;
				System.out.println("Cube:"+cb);
			break;
			
			default:
				System.out.println("Invalid option");
				
		}
	}

}
