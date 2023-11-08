//A shop provides discount to customer as follows
//
//	Perches Amount                       Discount
//	
//	less than 500                        5%
//	500 to 1000                          10%
//	greater than 1000                    15%
//  Write a program to read perches amount calculate discount and amount pay by customer

package com.switchcase;

import java.util.Scanner;

public class ShopDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float per,dis,amt_pay;
		System.out.println("Enter Perches Amount: ");
		per=sc.nextFloat();
		if(per>0 && per<=500)
		{
			dis=0.05f*per;
			amt_pay= per-dis;
			System.out.println("Amount to pay Customer: "+amt_pay);
		}
		else if(per>500 && per<=1000)
		{
			dis=0.10f*per;
			amt_pay=per-dis;
			System.out.println("Amount to pay Customer: "+amt_pay);
		}
		else
		{
			dis=0.15f*per;
			amt_pay=per-dis;
			System.out.println("Amount to pay Customer: "+amt_pay);
		}
	}

}
