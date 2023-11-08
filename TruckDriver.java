/*
 A company Insures it's driver in following cases
 1. If Driver is Married
 2. If Driver is Unmarried male having age greater than 30
 3. If Driver is Unmarried female having age greater than 25
 other cases the driver is not Insured
  write a program to read marital status,gender and age of driver check whether the driver is Insured or not
 */

package com.switchcase;

import java.util.Scanner;

public class TruckDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		String ms,gen;
		System.out.println("Enter The age Of driver: ");
		age=sc.nextInt();
		System.out.println("Enter gender of driver:");
		gen=sc.next();
		System.out.println("Enter marital status of the driver:");
		ms=sc.next();
		if(ms.equalsIgnoreCase("married"))
			System.out.println("Insured");
		else if(age>30 && gen.equalsIgnoreCase("male"))
			System.out.println("Insured");
		else if(age>25 && gen.equalsIgnoreCase("female"))
			System.out.println("Insured");
		else
			System.out.println("Not Insured");
	}

}
