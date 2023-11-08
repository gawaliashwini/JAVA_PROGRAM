/*
 Write a program for enhanced for loop 
 */
package com.loops;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {11,22,33,44,55,66};
		int sum=0;
		for(int v:a)
		{
			sum=sum+v;
		}
		System.out.println("Sum: "+sum);
	}

}
