/* 
 Write a program to print n natural numbers 
 */
package com.loops;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
