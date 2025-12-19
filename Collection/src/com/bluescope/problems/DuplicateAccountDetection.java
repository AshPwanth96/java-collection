package com.bluescope.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateAccountDetection {
	public static void main(String args[]) {
		List<Long> account =  new ArrayList<Long>();
		
		account.add(101l);
		account.add(102l);
		account.add(101l);
		account.add(103l);
		account.add(104l);
		account.add(102l);
		
		Set<Long> s = new HashSet<Long>();
		
		
		List<Long> duplicates = new ArrayList<Long>();

		
		for(long l:account) {
			
			if(s.add(l)==false) {
				duplicates.add(l);
			}
		}
		
		System.out.println("Duplicate accounts are :"+duplicates);
		System.out.println("Unique accounts are "+s);
	}

}
