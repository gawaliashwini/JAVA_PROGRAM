/*
 Read two number and display maximum number 
 */

package com.decisionmaking;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter Two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println("Maximum Number: "+n1);
		}
		else
		{
			System.out.println("Maximum Number: "+n2);
		}
	}

}
