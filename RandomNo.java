
/* Write A Program to generate Random numbers  	1. 0 to 100
  												2. 100 to 200
 */

package com.math;

public class RandomNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n=(int)(Math.random()*100);
		System.out.println("n="+n);
		
		n=200-(int)(Math.random()*100);
		System.out.println("n="+n);
	}

}
