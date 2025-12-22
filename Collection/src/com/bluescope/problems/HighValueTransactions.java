package com.bluescope.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Transactions6{
	String userId;
	int amount;
	
	Transactions6(String userId, int amount){
		this.userId = userId;
		this.amount = amount;
	}
}

public class HighValueTransactions {
	public static void main(String args[]) {
		
		List<Transactions6> list = new ArrayList<Transactions6>();
		
		list.add(new Transactions6("user1", 5000));
		list.add(new Transactions6("user1", 10000));
		list.add(new Transactions6("user2", 15000));
		list.add(new Transactions6("user1", 2000));
		list.add(new Transactions6("user3", 7000));
		list.add(new Transactions6("user2", 25000));

		Map<String, List<Integer>> trans = new HashMap<String, List<Integer>>();
		
		for(Transactions6 t:list) {
		
			
			if(t.amount<=10000) {
				continue;
			}
			
			int amount = t.amount;
			String userId = t.userId;
			
			if(!trans.containsKey(t.userId)) {
				trans.put(userId, new ArrayList<>());
			}
			
			trans.get(userId).add(amount);
			
			
			
			
			
		}
		
		System.out.println(trans);
		
		
	}

}
