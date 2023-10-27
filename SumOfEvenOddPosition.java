/*
 * Write a Program to Find Sum Of Even and Odd Positions in array
 */
package com.array;

import java.util.Scanner;

public class SumOfEvenOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Numbers you want?");
		int n=sc.nextInt();
		int  a[]=new int[n];
		int i,evensum=0,oddsum=0;
		System.out.println("Enter "+n+" nos:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(i%2==0)
				oddsum=oddsum+a[i];
			else
				evensum=evensum+a[i];
		}
		System.out.println("Sum Of Even Position Element:"+evensum);
		System.out.println("Sum Of Odd Position Element:"+oddsum);
	}

}
