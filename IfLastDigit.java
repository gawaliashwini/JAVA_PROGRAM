/*
 write a program to read a number to find last digit if the number in between 100 to 200
 */

package com.decisionmaking;

import java.util.Scanner;

public class IfLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,d;
		System.out.println("Enter The Number");
		n=sc.nextInt();
		if(n>=100 && n<=200)
		{
			d=n%10;
			System.out.println("The last digit: "+d);
		}
	}

}
