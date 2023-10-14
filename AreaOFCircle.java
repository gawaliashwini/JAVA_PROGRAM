/*
Write a program to calculate Area Of Circle
*/
package lab1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float area,radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		radius=sc.nextFloat();
		area=3.14f*radius*radius;
		System.out.println("Area of Circle:"+area);
	}

}
