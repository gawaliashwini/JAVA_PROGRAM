/*
 Program to perform the area of
 1. Rectangle
 2. Square
 3. Circle 
 4. Triangle
 */


package com.switchcase;

import java.util.Scanner;

class AreaOfFigures{
static  Scanner scanner= new Scanner(System.in);

	public static void areaRectangle() {
	  float l,b,area;
	  
	  System.out.println("Enter Length and breadth of Rectangle ");
	  l=scanner.nextFloat();
	  b=scanner.nextFloat();
	  
	  area = l*b;
	  
	  System.out.println("Area of Rectangle of length="+l+" and breadth="+b+" is "+area);
		
	}

	public static void areaSquare() {
		float side, area;
		
		System.out.println("Enter side of Rectangle");
		side = scanner.nextFloat();
		
		area = side*side;
		
		System.out.println("Area of Square of side="+side +" is "+area);
		
	}

	public static void areaCircle() {
		float radius, area;
		
		System.out.println("Enter radius of Circle");
		radius = scanner.nextFloat();
		
		area = (22/7)*radius*radius;  // 3.13159f*radius*radius
		
		System.out.println("Area Of Circle of Radius = "+radius+ " is "+area);
		
	}
	
	public static void areaTriangle() {
		float base, ht, area; 
		
		System.out.println("Enter base and height of a triangle");
		base = scanner.nextFloat();
		ht = scanner.nextFloat();
		
		area = (base*ht)/2;
		
		System.out.println("Area of a Triangle of base="+base +" and height="+ht+" is "+area);
	}
	
}

public class AreaOfFigurs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("********MENU**********");
		System.out.println("1.Reactangle");
		System.out.println("2.Square");
		System.out.println("3.Circle");
		System.out.println("4.Triangle");
		
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:AreaOfFigures.areaRectangle();
		       break;
		case 2:AreaOfFigures.areaSquare();
		       break;
		case 3:AreaOfFigures.areaCircle();
				break;
		case 4:AreaOfFigures.areaTriangle();
		        break;
		 default:
			     System.out.println("Invalid Input");
		
		}

	}

}
