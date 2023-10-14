/*
WRITE A PROGRAM TO CALCULATE AREA OF TRIANGLE
*/

package lab1;

import java.util.Scanner;

public class AreaOfTriagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float area,b,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the breadth and height:");
		b=sc.nextFloat();
		h=sc.nextFloat();
		area=0.5f*b*h;
		System.out.println("Area of Circle:"+area);
	}

}

