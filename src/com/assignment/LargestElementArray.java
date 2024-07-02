package com.assignment;

import java.util.Arrays;

/*
 * WAP to find the second largest element in an array
 */
public class LargestElementArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
	        System.out.println("Original array :" + Arrays.toString(a));	        
	        
	        int index = a.length - 1;
	        while (a[index] == a[a.length-1]) {
	            index--;
	        }
	        
	        System.out.println("Second largest value: " + a[index]);
	    }
	}