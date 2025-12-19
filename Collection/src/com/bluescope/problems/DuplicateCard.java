package com.bluescope.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCard {
	public static void main(String args[]) {
		
		List<Long> id = new ArrayList<Long>();
		
		id.add(111l);
		id.add(112l);
		id.add(113l);
		id.add(111l);
		id.add(112l);
		id.add(114l);
		id.add(114l);
		
		Set<Long> access = new TreeSet<Long>();
		
		Set<Long> blocked = new TreeSet<Long>();
		
		for(Long l:id) {
			if(access.add(l)==false) {
				blocked.add(l);
			}
		}
		
		access.removeAll(blocked);
		
		System.out.println("Safe Ids list "+access);
		System.out.println("Blocked Ids "+blocked);
	}

}
