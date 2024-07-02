package com.assignment;

import java.util.Scanner;
/*
 * W.A.J.P. to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show custom
exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw
amount:2500
Sorry, insufficient balance, you need more 500 Rs.To perform
this transaction
 */
class JayException extends Exception{
	double amount;
	public JayException(double amount) {
		this.amount=amount;
	}
	
}
class ATM{
	double ballance;
	public void deposit(double amount) {
//		ballance=ballance+amount;
		ballance+=amount;// short hand operator
		System.out.println("total ballance is :"+ballance);
	}
	public void withdraw(double amount) throws JayException {
		if(amount<=ballance) {
		ballance-=amount;
		System.out.println("amount withdraw is :"+amount+" remianing ballance is :" +ballance);
	}else {
		double needs=amount-ballance;
				
		throw new JayException(needs);
	}
	}
}
public class AmountMessage {
	public static void main(String[] args) {
		ATM atm=new ATM();
		Scanner sc=new Scanner(System.in);
		double amount;
		
		System.out.println("Enter is amount to be deposited :");
		amount=sc.nextDouble();
		
		
		atm.deposit(amount);

		System.out.println("Enter is amount to be Withdraw :");
		amount=sc.nextDouble();
		
		try {
			atm.withdraw(amount);
		} catch (JayException e) {
//			e.printStackTrace();
			System.out.println("Sorry, insufficient balance,If you deposit "+e.amount+"Rs more "+"you can withdraw "+amount+"Rs");
		}
	}

}
