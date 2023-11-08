/*
 Write a program to print sunny number between 1 to 100 
 */

package com.loops;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,d,sq;
		for(i=1;i<=100;i++)
		{
			d=i%10;
			sq=d*d*d;
			if(sq==i)
				System.out.println(i);
		}
	}

}
