package com.bluescope.problems;

import java.util.ArrayList;
import java.util.List;

class Transaction{
	String type;
	int amount;
	
	Transaction(String type, int amount){
		this.type = type;
		this.amount = amount;
	}
	
	
}

public class TransactionsType {
	public static void main(String args[]) {
		List<Transaction> tran = new ArrayList<Transaction>();
		
		tran.add(new Transaction("Debit", 2000));
		tran.add(new Transaction("Credit", 1000));
		tran.add(new Transaction("Debit", 3000));
		tran.add(new Transaction("credit", 2000));
		tran.add(new Transaction("Credit", -5000));
		
		calculateTotals(tran);
		
		
	}
	
	static void calculateTotals(List<Transaction> transactions) {
		
		int creditAmount = 0, debitAmount = 0;
		
		for(Transaction t : transactions) {
			if(t.amount<=0) {
				continue;
			}
			
			if(t.type.equalsIgnoreCase("credit")) {
				creditAmount += t.amount;
			}else if(t.type.equalsIgnoreCase("debit")) {
				debitAmount += t.amount;
			}
		}
		
		System.out.println("Total credit : "+creditAmount);
		System.out.println("Total debit : "+debitAmount);
	}

}
