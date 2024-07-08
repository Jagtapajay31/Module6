package com.assignment;

import java.util.Scanner;

/*
 * WAP to compute the sum of the first 100 prime numbers
 */
public class PrimeSum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Numer :");
		int n = scanner.nextInt();
		int i,j,sum=0;
		
		for (i = 1; i <=n; i++) {
			int count=0;
			for (j = 2; j <= i/2; j++) {
				if (i%j==0) {
					count++;
					break;
				}
			}
		
			if (count==0 && i!=1 ) {
				System.out.println("prime no :"+i);

				sum=sum+i;
			}
		}
		System.out.println("Sum prime number :"+sum);
	}
}