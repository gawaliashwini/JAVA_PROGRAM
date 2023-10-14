/*
Write a program to calculate area of Square
*/

package lab1;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius:");
	n=sc.nextInt();
	area=n*n;
	System.out.println("Area of Square:"+area);
	
	}

}
