/*
 * Write a program to print  *
 * 							 *  * 
 * 							 *  *  *  
 * 							 *  *  *  *
 * 							 *  *  *  *  *
 */

package com.pattern;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
