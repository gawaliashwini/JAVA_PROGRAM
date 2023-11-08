/*
 write a program to print Armstrong numbers
 */
package com.loops;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d, c, num, sum = 0;

        
        System.out.println("Enter the number");
        n = sc.nextInt();

        num = n; 
        while (n > 0) {
            d = n % 10;     
            c = d * d * d;  
            sum = sum + c;  
            n = n / 10;      
        }
        if (sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
