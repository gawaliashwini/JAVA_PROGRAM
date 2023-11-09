/*
 * Write a program to print  A  B  C  D  E
 * 							 A  B  C  D
 * 							 A  B  C  
 * 							 A  B
 * 							 A
 */

package com.pattern;

public class PatternAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j;
		for(i='E';i>='A';i--)
		{
			for(j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
