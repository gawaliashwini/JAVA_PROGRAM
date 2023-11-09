/*
 * Write to read a number as many as user want check number is armstrong or not.
 */
package com.loops;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,num,d,c,sum=0;
		System.out.println("Enter The Number: ");
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			d=n%10;
			c=d*d*d;
			sum=sum+c;
			n=n/10;
		}
		if(sum==num)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
		
	}

}
