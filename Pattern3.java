/*
 * Write a program to print  5
 *                           5  4  
 *                           5  4  3  
 *                           5  4  3  2
 *                           5  4  3  2  1			      
 */
package com.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
