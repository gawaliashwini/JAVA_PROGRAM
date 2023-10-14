package lab1;

import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area,l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth:");
		l=sc.nextInt();
		b=sc.nextInt();
		area=l*b;
		System.out.println("Area Of Rectangle is:" +area);
	}

}
