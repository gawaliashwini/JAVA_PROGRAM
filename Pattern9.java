/*
 * Write a program to print  1  2  3  4  5  4  3  2  1
 * 							    1  2  3  4  3  2  1
 * 							       1  2  3  2  1
 * 							          1  2  1
 * 							             1
 */
package com.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}