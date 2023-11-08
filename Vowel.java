/* 
 Program to check vowel or not 
 */

package com.switchcase;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter Character:");
		ch=sc.next().toLowerCase().charAt(0);
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Not a Vowel.");
			
		}
		
	}

}
