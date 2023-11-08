/*
 Write a program read a number as many as user want and calculate square of every number 
 */
package com.loops;

import java.util.Scanner;

public class OddLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sq,responce;
		do {
			System.out.println("Enter the number");
			n=sc.nextInt();
			sq=n*n;
			System.out.println("Square of the num:"+sq);
			System.out.println("do you want to continue(1/0)?");
			responce=sc.nextInt();
		}while(responce==1);
		
	}

}
