/*
 * Read three numbers and choice perform following operation
 * 1. Maximum 
 * 2. Minimum
 * 3. Average 
 */
package com.loops;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c,avg,ch;
		do {
			System.out.println("Enter Three numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			System.out.println("Choices are \n1. Maximum \n2. Minimum\n3. Average ");
			ch=sc.nextInt();
			switch(ch) 
			{
				case 1:
					if(a>b && a>c)
						System.out.println("Maxium number:"+a);
					else if(b>a && b>c)
						System.out.println("Maximum number:"+b);
					else
						System.out.println("Maximum number:"+c);
				break;
				
				case 2:
					if(a<b && a<c)
						System.out.println("Minimum number:"+a);
					else if(b<a && b<c)
						System.out.println("Minimum number:"+b);
					else
						System.out.println("Minimum number:"+c);
				break;
					
				case 3:
					avg=(a+b+c)/3;
					System.out.println("Average number:"+avg);
				break;
			}
		}while(ch>=1 && ch<=3);
	}

}
