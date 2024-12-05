package com.assignment;
/*
 * WAP to demonstrate try catch block
 */
public class TryCatch {
	public static void main(String[] args) {
		int a=0,b=10;
		
		try {
		System.out.println("Division is :"+a/b);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("something is wrong");
		}
	}
}