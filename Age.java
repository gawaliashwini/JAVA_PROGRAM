/*
 Read ages of Ram, Sham and ajay display the younger one 
 */

package com.decisionmaking;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ram,sham,ajay;
		System.out.println("Enter the Age of ram,sham and ajay:");
		ram=sc.nextInt();
		sham=sc.nextInt();
		ajay=sc.nextInt();
		if(ram<sham && ram<ajay)
		{
			System.out.println("Ram is Younger");
		}
		else if(sham<ajay && sham<ram)
		{
			System.out.println("Sham is Younger");
		}
		else
		{
			System.out.println("Ajay is Younger");
		}
	}

}
