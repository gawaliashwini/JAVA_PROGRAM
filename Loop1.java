/*
 Write a program to calculate 1+4+9+16+......+100;
 */

package com.loops;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			sum=sum+(i*i);
		}
		System.out.println("Sum:"+sum);
	}

}
