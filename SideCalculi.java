/* Write A program to Calculate Side*/

package com.math;

import java.util.*;

public class SideCalculi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b,x,side;
		System.out.println("Enter the Values of a,b,x: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		x=sc.nextDouble();
		side=Math.sqrt(a*a+b*b-2*a*b*Math.cos(x));
		System.out.println("Side="+side);
		
	}

}
