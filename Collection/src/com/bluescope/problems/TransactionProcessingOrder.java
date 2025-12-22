package com.bluescope.problems;

import java.util.ArrayDeque;
import java.util.Queue;

public class TransactionProcessingOrder {
	public static void main(String args[]) {
		Queue<Integer> trans = new ArrayDeque<Integer>();
		
		trans.offer(1001);
		trans.offer(1002);
		trans.offer(1003);
		
		while(!trans.isEmpty()) {
			System.out.println("processing :"+trans.poll());
		}
	}

}
