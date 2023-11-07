
/*
 Read Marks of three subject calculate marks, percentage and grade 
 */
package com.decisionmaking;

import java.util.Scanner;

public class MarkGrade {

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
		if(per>75)
		{
			System.out.println("Distiction");
		}
		else if(per>65)
		{
			System.out.println("First Class");
		}
		else if(per>55)
		{
			System.out.println("Second Class");
		}
		else if(per>45)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
