package com.bluescope.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Payment {
    String userId;
    boolean success;

    public Payment(String userId, boolean success) {
        this.userId = userId;
        this.success = success;
    }
}

public class FailedPaymentTracker {
    public static void main(String[] args) {

        Map<String, Integer> failedCount = new HashMap<>();
        Set<String> failed = new HashSet<>();

        List<Payment> list = List.of(
                new Payment("user1", false),
                new Payment("user1", true),
                new Payment("user2", false),
                new Payment("user1", false),
                new Payment("user3", false),
                new Payment("user2", true),
                new Payment("user3", false),
                new Payment("user3", false)
        );

        for (Payment p : list) {

            if (p.success) {
                continue;
            }

            String userId = p.userId;

            if (!failedCount.containsKey(userId)) {
                failedCount.put(userId, 1);
            } else {
                failedCount.put(userId, failedCount.get(userId) + 1);
            }

            if (failedCount.get(userId) >= 2) {
                failed.add(userId);
            }
        }

        System.out.println("Failed payment count:");
        System.out.println(failedCount);

        System.out.println("Risky users:");
        System.out.println(failed);
    }
}
