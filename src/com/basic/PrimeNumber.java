package com.basic;

import java.util.Scanner;

/*
 *W.A.J.P to check given number is Prime or not?
 */

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Numer :");
		int n = scanner.nextInt();
		
		int count =  0;
		for (int i = 1; i <= n; i++) {
			if (n % 1==0) {
				count++;
			}
		}
		
		if (count==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime number");
		}
	}
}