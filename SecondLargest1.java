package com.array;

import java.util.Scanner;

public class SecondLargest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int high=0;
		int sechigh=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		a=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<size;i++) {
			if(a[i]>high) {
				sechigh=high;
				high=a[i];
			}
			if(a[i]<high && a[i]>sechigh) {
				sechigh=a[i];
			}
		}
		System.out.println("SecondHighest:"+sechigh);
		
		
	}

}