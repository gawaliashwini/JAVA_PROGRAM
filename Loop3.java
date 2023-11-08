/*
 Read a number and check prime or not 
 */
package com.loops;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				cnt++;
		}
		if(cnt==2)
			System.out.println("Prime number");
		else
			System.out.println("Not Prime number");
	}

}
