/*
 *Write a program to read as many as user wants check sunny or not 
 */
package com.loops;

import java.util.Scanner;

public class SunnyNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,d,c,responce;
		do {
			System.out.println("Enter the number:");
			n=sc.nextInt();
			d=n%10;
			c=d*d*d;
			if(c==n)
				System.out.println("The given number is sunny");
			else
				System.out.println("Not sunny number");
			System.out.println("Do you wnat to continue(1/0)?");
			responce=sc.nextInt();
		}while(responce==1);
	}

}
