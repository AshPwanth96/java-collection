package com.bluescope.problems;

import java.util.ArrayList;
import java.util.List;

class Transactions{
	String type;
	int amount;
	
	Transactions(String type, int amount){
		this.amount = amount;
		this.type = type;
	}
}

public class TransactionType2 {
	public static void main(String args[]) {
		List<Transactions> transactions = new ArrayList<Transactions>();
		
		transactions.add(new Transactions("credit", 5000));
		transactions.add(new Transactions("debit", 6000));
		transactions.add(new Transactions("credit", -5000));
		transactions.add(new Transactions("debit", 45000));
		transactions.add(new Transactions("credit", 15000));
		transactions.add(new Transactions("debit", -9000));
		
		calculateTotals(transactions);
	}
	
	static void calculateTotals(List<Transactions> transaction) {
		int debitAmount = 0, creditAmount = 0;
		for(Transactions e: transaction) {
			if(e.amount<=0) {
				continue;
			}
			
			if(e.type.equalsIgnoreCase("credit")) {
				creditAmount += e.amount; 
			}else if(e.type.equalsIgnoreCase("debit")) {
				debitAmount += e.amount;
			}
		}
		
		System.out.println("The debit amount is "+debitAmount);
		System.out.println("The credit amount is "+creditAmount);
	}

}
