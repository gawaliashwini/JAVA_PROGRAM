/*
 * Write a program to find the maximum and minimum number in array 
 */

package com.array;

import java.util.Scanner;

public class MinMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many No. you want?");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,max,min;
		System.out.println("Enter "+n+" no:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum no: "+max);
		min=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum no: "+min);
	}

}
