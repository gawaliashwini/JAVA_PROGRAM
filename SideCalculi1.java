/* Write A program to Calculate x */
package com.math;

import java.util.*;

public class SideCalculi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Double a,b,x;
		System.out.println("Enter the value of a and b: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		x=Math.sqrt(Math.cos(a)+b)/(Math.sin(b)-a);
		System.out.println("value of x: "+x);
	}

}
