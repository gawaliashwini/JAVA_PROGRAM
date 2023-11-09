/*
 * Write a program to print  E  D  C  B  A
 * 							 E  D  C  B
 * 							 E  D  C  
 * 							 E  D
 * 							 E
 */
package com.pattern;

public class PatternAB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j;
		for(i='A';i<='E';i++)
		{
			for(j='E';j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}