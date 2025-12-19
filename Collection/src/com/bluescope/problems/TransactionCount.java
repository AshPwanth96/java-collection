package com.bluescope.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Transaction1{
	String userId;
	int amount;
	
	public Transaction1(String userId, int amount) {
		this.userId= userId;
		this.amount = amount;
	}
}

public class TransactionCount {
	public static void main(String args[]) {
		List<Transaction1> lt = new ArrayList<Transaction1>();
		
		lt.add(new Transaction1("user1", 1000));
		lt.add(new Transaction1("user2", 500));
		lt.add(new Transaction1("user1", 200));
		lt.add(new Transaction1("user3", 300));
		lt.add(new Transaction1("user2", 700));
		lt.add(new Transaction1("user1", 50));
		
		Map<String, Integer> count = new HashMap<String, Integer>();
		
		for(Transaction1 t:lt) {
			String user = t.userId;
			if(count.containsKey(user)) {
				count.put(user, count.get(user)+1 );
				
			}else {
				count.put(user, 1);
			}
		}
		
		System.out.println(count);
		
	}

}
