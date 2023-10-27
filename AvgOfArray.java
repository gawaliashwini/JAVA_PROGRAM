/*
 * Write a program to calculate average of array elements
 */

package com.array;

import java.util.Scanner;

public class AvgOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Numbers you want?");
		int n=sc.nextInt();
		int  a[]=new int[n];
		int i,avg,sum=0;
		System.out.println("Enter "+n+" nos:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("Average of array Element: "+avg);
	}

}
