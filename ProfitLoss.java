/*
 write a selling price, cost price of an item and check whether seller made profit or loss and how  much 
 */

package com.decisionmaking;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Selling price and cost price: ");
		int cp,sp;
		sp=sc.nextInt();
		cp=sc.nextInt();
		if(sp>cp)
		{
			System.out.println("The Profit is "+(sp-cp));
		}
		else
		{
			System.out.println("The Loss is "+(cp-sp));
		}
	}

}
