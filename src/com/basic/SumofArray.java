package com.basic;
/*
 *  WAP to sum values of an array.
 */
public class SumofArray {
	public static void main(String[] args) {
		int[] n=new int[] {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			sum=sum+n[i];
		}
		System.out.println("sum of array :"+ sum);
	}

}
