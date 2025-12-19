package com.bluescope.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Transactions2{
	String userId;
	int money;
	
	public Transactions2(String userId, int money) {
		this.userId = userId;
		this.money = money;
	}
}
public class TotalAmountSpent {
	public static void main(String args[]) {
		List<Transactions2> spentList = new ArrayList<Transactions2>();
		
		spentList.add(new Transactions2("user1", 1000));
		spentList.add(new Transactions2("user2", 500));
		spentList.add(new Transactions2("user1", 560));
		spentList.add(new Transactions2("user3", 360));
		spentList.add(new Transactions2("user2", 900));
		
		Map<String, Integer> spendMap = new HashMap<String, Integer>();
		
		for(Transactions2 t:spentList) {
			
			String userId = t.userId;
			
			if(spendMap.containsKey(userId)) {
				spendMap.put(userId, spendMap.get(userId)+t.money);
			}else {
				spendMap.put(userId, t.money);
			}
			
			
		}
		System.out.println(spendMap);
		}

}
