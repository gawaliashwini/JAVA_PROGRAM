/*
 * Write to read a number as many as user want calculate reverse of every number
 */
package com.loops;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int n,num,d,sum=0,ch;
		do {
			System.out.println("Enter a number:");
			n=sc.nextInt();
			num=n;
			while(n>0)
			{
				d=n%10;
				sum=sum*10+d;
				n=n/10;
			}
			if(num==sum)
				System.out.println("reverse number");
			else
				System.out.println("Not reverse number");
			System.out.println("Do you want to continue(1/0)?");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
