package com.basic;

import java.util.Scanner;

/*
 * W.A.J.P to check given number is Armstrong or not?
 */
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int backUP=n;
        int sum=0;
		
        while (n>0) {
			sum=sum+ (n%10)*(n%10)*(n%10);
			n=n/10;
		}
//        System.out.println(sum);
//        System.out.println(n);
        if (sum==backUP) {
        	System.out.println("armstrong");
			
		} else {
			System.out.println("not armstrong");

		}   
	}
}	
	