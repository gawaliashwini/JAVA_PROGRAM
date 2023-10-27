
/*
 * Program to print the matrix and find principle diagnoal element 
 */

package com.array;

import java.util.Scanner;

public class ArrayElement {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3x3 matrix elements");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elements of matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		//print Principal Diagonal elements
		

		System.out.println("Principal Diagonal elements");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j)
				System.out.print(a[i][j]+" ");
			}
		}
	}

}