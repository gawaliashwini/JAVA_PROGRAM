/*
 Write a program read a number to perform following operation
 1. Addition
 2. Substraction
 3. Multiplication
 4. Division
 */

package com.switchcase;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,add,sub,mul,div,ch;
		System.out.println("Enter two number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the choices: \n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				add=a+b;
				System.out.println("Addition: "+add);
			break;
			case 2:
				sub=a-b;
				System.out.println("Substraction: "+sub);
			break;
			case 3:
				mul=a*b;
				System.out.println("Multiplication: "+mul);
			break;
			case 4:
				div=a/b;
				System.out.println("Division: "+div);
			break;
			default:
				System.out.println("Invalid Choice");
		}
		
	}

}
