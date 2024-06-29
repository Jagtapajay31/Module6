package com.assignment;
/*
 * W.A.J.P to Take three numbers from the user and print the greatest
number
 */

public class GreatestNumber {
	public static void main(String[] args) {
		int a=101, b=10, c=1000;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater :"+a);
			}else {
				System.out.println("c is greater :"+c);
			}
		}else {
			if(b>c) {
				System.out.println("b is greater :"+b);
			}else {
				System.out.println("C is greater :"+c);
			}
			}
		}
	}