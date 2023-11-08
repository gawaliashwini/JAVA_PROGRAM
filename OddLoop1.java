/*
 Write a program read a number as many as user want and calculate number is positive or negative 
 */
package com.loops;

import java.util.Scanner;

public class OddLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,responce;
		do {
			System.out.println("Enter the number");
			n=sc.nextInt();
			if(n>0)
				System.out.println("Positive number");
			else
				System.out.println("Negative number");
			System.out.println("Do You Want to Continue(1/0)?");
			responce=sc.nextInt();
		}while(responce==1);
	}
}
