/*
 Write a program to print 1,11,21,31,41,........,111 
 */
package com.loops;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			System.out.println(i);
			i=i+10;
		}while(i<=111);
	}

}
