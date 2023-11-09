/*
 * Write a program to print  A
 * 							 A  B 
 * 							 A  B  C 
 * 							 A  B  C  D
 * 							 A  B  C  D  E
 */

package com.pattern;

public class PatternAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j;
		for(i='A';i<='E';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
