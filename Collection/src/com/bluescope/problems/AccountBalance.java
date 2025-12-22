package com.bluescope.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Trans{
	long accountId;
	String type;
	int amount;
	
	Trans(long accountId, String type, int amount){
		this.accountId = accountId;
		this.amount =  amount;
		this.type = type;
	}
}

public class AccountBalance {
	public static void main(String args[]) {
		
		List<Trans> list = new ArrayList<Trans>();
		
		list.add(new Trans(101, "CREDIT", 1000));
		list.add(new Trans(101, "DEBIT", 300));
		list.add(new Trans(102, "CREDIT", 500));
		list.add(new Trans(101, "CREDIT", 200));
		list.add(new Trans(102, "DEBIT", 700));
		list.add(new Trans(101, "DEBIT", 100));
		
		Map<Long, Integer> balanceMap = new HashMap<Long, Integer>();
		
		for(Trans t:list) {
			
			if(t.amount<=0) {
				continue;
			}
			
			long accountId = t.accountId;
			String type = t.type;
			int amount = t.amount;
		
			
			if(!balanceMap.containsKey(accountId)) {
				balanceMap.put(accountId, 0);
			}
			
			int curentBalance = balanceMap.get(accountId);
			
			if(t.type.equalsIgnoreCase("CREDIT")) {
			
				balanceMap.put(accountId, curentBalance+amount);
			}else if(t.type.equalsIgnoreCase("DEBIT")){
			
				balanceMap.put(accountId,curentBalance-amount);
			}
		}
		
		System.out.println(balanceMap);

	}

}
