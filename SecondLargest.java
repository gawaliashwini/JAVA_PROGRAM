/*
 * Write a Program to Find Second Largest Number in array
 */

package com.array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String var;
		do {
			System.out.println("How many No. you want?");
			int n=sc.nextInt();
			int a[]=new int[n];
			int i,j,temp;
			System.out.println("Enter "+n+" no:");
			for(i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=1;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Second largest Number: "+a[1]);
			System.out.println("Do you want To continue(Yes/NO)");
			var=sc.next();
		}while(var.equalsIgnoreCase("yes"));

		}
		
}
