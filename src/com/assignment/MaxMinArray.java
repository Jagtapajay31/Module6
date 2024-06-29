package com.assignment;

import java.util.Arrays;

/*
 *  WAP to find the maximum and minimum value of an array.
 */
public class MaxMinArray {
	public static void main(String[] args) {
        int a[]={1,423,6,46,34,23,13,53,4000};
        
        Arrays.sort(a);
        System.out.println("min :"+a[0]+" max :"+a[a.length-1]);
	}
}