
/*
 * Insert an element in an array according to user input
*/
package com.array;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,num,pos,ele;
		System.out.println("How many Element You want?");
		num=sc.nextInt();
		int a[]=new int[num+1];
		System.out.println("Enter "+num+ " Elements");
		for(i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element for insertion");
		ele=sc.nextInt();
		System.out.println("position to insert");
		pos=sc.nextInt();
		for(i=(num-1);i>=(pos-1);i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=ele;
		System.out.println("After inserting the elements the arrry");
		for(i=0;i<num;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[num]);
	}

}
