/*
 Read a Number calculate square if it is positive 
 */

package com.decisionmaking;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sq;
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		if(n>0)
		{
			sq=n*n;
			System.out.println("Square of number: "+sq);
		}
	}

}
