/*
 Write a program to print 1,4,9,16,100
 */

package com.loops;

import java.util.Scanner;

public class WhileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i<=10)
		{
			System.out.println(i*i);
			i++;
		}
	}

}
