/*
 * Write a program to read a number and choice perform following number
 * 1. Positive or negative
 * 2. Even or odd
 * 3. square
 * 4. cube
 * 5. exit
 */
package com.loops;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sq,cb,ch;
		do {
			System.out.println("Enter the number");
			n=sc.nextInt();
			System.out.println("Choices are \n1. Positive or negative\n2. Even or odd\n3. square\n4. cube\n5. exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(n>0)
						System.out.println("Positive number");
					else
						System.out.println("Negative number");
				break;
				
				case 2:
					if(n%2==0)
						System.out.println("Even number");
					else
						System.out.println("Odd number");
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
					System.out.println("Invalid Choice");
			}
		}while(ch>=1&&ch<=4);
	}	
}
