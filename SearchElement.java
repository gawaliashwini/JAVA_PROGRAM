

/*
 * Write an array Element to Search Array Element 
 */

package com.array;

import java.util.Scanner;

class LinearSearch{
	int a[], size, keyelement;
	int pos;
	
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		size = sc.nextInt();
		
		a = new int[size];
		System.out.println("Enter "+a.length+" elements ");
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter search element");
		keyelement = sc.nextInt(); 
		
	}
	void searchElement() {
		
				for(int i=0;i<a.length;i++) {
					if(a[i] == keyelement) {
						pos=i+1;
						break;
					}
				}
				if(pos>0) {
					System.out.println("Successful search , ");
					System.out.println(keyelement+" present at position "+pos);
				}else {
					System.out.println("Unsuccessful search");
					System.out.println(keyelement+" not presesnt");
				}
		}
}

public class SearchElement {

	public static void main(String[] args) {
		LinearSearch lob = new LinearSearch();
		lob.inputData();
		lob.searchElement();
	}

}