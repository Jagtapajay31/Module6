package com.basic;
/*
 *W.A.J.P to check given number is Prime or not?
 */

public class PrimeNumber {
	public static void main(String[] args) {
		int i,flag=0,m,n=30;
		  m=n/2;
		  if(n==0 && n==1){  
		   System.out.println("Not prime number :" +n);      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
				System.out.println("Not Prime Number :" +n);      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0){ 
			   System.out.println("Prime Number :" +n);
			   }
		   }
		  }
	}