package com.assignment;
/*
 * WAP to demonstrate multiple catch blocks
 */
public class MultipleCatchBlock {
	public static void main(String[] args) {
    
		int a=10,b=0;
		int[] num=new int[3];
		
		
		try {
		System.out.println("Division is :"+a/b);
		for (int i = 0; i <=3; i++) {
			num[i]=i+1;
			System.out.println(num[i]);
		}
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("something is wrong");
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("");
		}
		
		finally {
		System.out.println("this code is written by Ajay");
		System.out.println("ph is 1234567890");
	}
	}

}
