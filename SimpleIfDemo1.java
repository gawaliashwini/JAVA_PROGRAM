/*
 Write a number calculate cube if number is even 
 */

package com.decisionmaking;

import java.util.Scanner;

public class SimpleIfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int n,cb;
		System.out.println("Enter The number: ");
		n=sc.nextInt();
		if(n%2==0)
		{
			cb=n*n*n;
			System.out.println("Cube of number: "+cb);
		}
	}

}
