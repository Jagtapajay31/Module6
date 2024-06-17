package com.basic;

import java.util.Scanner;

/*
 * W.A.J.P to check given number is Armstrong or not?
 */
public class Armstrong {
	public static void main(String[] args) {
//		int n, count = 0, a, b, c, sum=0;
//		Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number:");
//        n = s.nextInt();
//        a = n;
//        c = n;
//        
//        for(;a>0; a /= 10) {
//        	count++;
//        }
//        
//        a = n;
//        sum = 0;
//        
//        for (;n > 0; n /= 10)
//        {
//            b = n % 10;
//            sum += Math.pow(b, count);
//        }
// 
//        if (sum == c)
//        {
//            System.out.println(c + " is an Armstrong number");
//        }
//        else
//        {
//            System.out.println(c + " is not an Armstrong number");
//        }
		int fact=153;
		
		for (int i = 153; i >=1; i--) {
			fact = fact*1;
			fact++;
		}
		System.out.println(fact);
        }
        	
	}