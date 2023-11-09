/*
 * Write to read a number as many as user want calculate factorial of every number
 */

package com.loops;

import java.util.Scanner;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,fact=1,ch;
		do {
			System.out.println("Enter the number:");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of number:"+fact);
			System.out.println("Do you want to continue(1/0)?");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
