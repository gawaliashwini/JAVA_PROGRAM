/*
 * Write a program to print  *  *  *  *  *  *  *  *  *
 * 							    *  *  *  *  *  *  *
 * 							       *  *  *  *  *
 * 							          *  *  *
 * 							             *
 */
package com.pattern;

public class PatternStar2 {

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
				System.out.print("* ");
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
