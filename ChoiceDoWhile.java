/*
 * Write a program to read a number and choice perform following number
 * 1. Maximum
 * 2. Minimum
 * 3. Average
 * 4. Exit
 */
package com.loops;

import java.util.Scanner;

public class ChoiceDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,ch,s;
		do {
			System.out.println("Enter Two Numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Choices are \n1. Maximum\n2. Minimum\n3. Average\n4. Exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(a>b)
						System.out.println("Maximum number:"+a);
					else
						System.out.println("Maximum number:"+b);
				break;
				case 2:
					if(a>b)
						System.out.println("Minimum number:"+b);
					else
						System.out.println("Minimum number:"+a);
				break;
				case 3:
					s=(a+b)/2;
					System.out.println("Average of num:"+s);
				break;
				default:
					System.out.println("Invalid choice");
			}
		}while(ch>=1 && ch<=3);
	}

}
