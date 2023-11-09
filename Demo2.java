/*
 * Write a program to read a number at a choice perform following  choices
 * 1. Addition
 * 2. Substraction
 * 3. Multiplication
 * 4. Division
 * 5. exit
 */
package com.loops;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,add,sub,mul,div,ch;
		do {
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Choices are \n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					add=a+b;
					System.out.println("Addition:"+add);
				break;
				case 2:
					sub=a-b;
					System.out.println("Substraction:"+sub);
				break;
				case 3:
					mul=a*b;
					System.out.println("Multiplication:"+mul);
				break;
				case 4:
					div=a/b;
					System.out.println("Division:"+div);
				break;
				default:
					System.out.println("Invalid choice");
			}
		}while(ch>=1 && ch<=4);
		
	}

}
