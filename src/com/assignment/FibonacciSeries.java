package com.assignment;
/*
 *  W.A.J.P for create Fibonacci Series.
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=0, n2 = 1, n3, i;
		System.out.println(n1+"  "+n2);
			for(i=2;i<40;++i){
				n3=n1+n2;
				System.out.println("  "+n3);
				
				n1=n2;
				n2=n3;
				}
			}
	}