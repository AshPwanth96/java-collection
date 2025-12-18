package com.bluescope.problems;

class Bank{
	private long accountNumber;
	
	private String name;
	
	private double balance;
	
	Bank(long accountNumber, String name){
		this.accountNumber = accountNumber;
		this.name = name;
		balance = 0;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Updated balance is "+balance);
		}else {
			System.out.println("Deposit amount greater than 0");
		}
	}
	
	void withdraw(double amount) {
	    if (amount <= 0) {
	        System.out.println("Withdrawal amount should be greater than 0");
	    } else if (amount <= balance) {
	        balance = balance - amount;
	        System.out.println("Updated balance is " + balance);
	    } else {
	        System.out.println("Balance is not enough");
	    }
	}

	
	
	void getBalance() {
		System.out.println("The account balance is "+balance);
	}
	
	void getDetails() {
		System.out.println("Name of the person is "+name);
		System.out.println("Account number is "+accountNumber);
		System.out.println("Bank balance "+balance);
	}
}

public class BankAccountUsingOops {
	public static void main(String args[]) {
		
		Bank one = new Bank(123, "ash");
		
		one.deposit(10000);
		
		one.withdraw(50000);
		
		one.withdraw(10);
		
		one.getBalance();
		
		one.getDetails();
		
		
		
	}

}
