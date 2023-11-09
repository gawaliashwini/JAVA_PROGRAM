/*
 * Write a program to print  1
 * 							 2  2 
 * 							 3  3  3  
 * 							 4  4  4  4
 * 							 5  5  5  5  5
 */

package com.pattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
