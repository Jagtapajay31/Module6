package com.assignment;
/*
 * WAP to Copy one array into another
 */
public class CopyArray {
	public static void main(String[] args) {
		int a[] ={10,20,30}; 
        int b[] =new int[a.length]; 
  
        b = a;
        System.out.println("a[] :");
        
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
  
        System.out.println("b[] :");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        }
	}