/*
 * Write a program to print          1
 * 								  1  2
 * 							   1  2	 3
 * 							1  2  3	 4
 * 						 1	2  3  4	 5
 */

package com.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
