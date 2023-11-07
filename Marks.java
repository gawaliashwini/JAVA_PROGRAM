/*
 Write a program to accept marks of three subjects calculate total marks and percentage
 */

package com.math;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double Marathi,Hindi,English,total,per;
		System.out.println("Enter marks of Marathi, Hindi and English: ");
		Marathi=sc.nextDouble();
		Hindi=sc.nextDouble();
		English=sc.nextDouble();
		total=Marathi+English+Hindi;
		per=total/3;
		System.out.println("Total Marks="+total);
		System.out.println("Percentage="+per);
	}

}
