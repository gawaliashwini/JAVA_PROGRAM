/*
 * Write a program to print  *  *  *  *  *
 * 							 *           *
 * 							 *           *
 * 							 *           *
 * 							 *  *  *  *  *
 */
package com.pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)  
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
