package com.bluescope.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueLoginTracker {
    public static void main(String[] args) {

        Map<String, Integer> trans = new HashMap<>();
        Set<String> multipleLogin = new HashSet<>();

        List<String> logins = List.of(
                "user1", "user2", "user1",
                "user3", "user2", "user2"
        );

        for (String user : logins) {

            if (!trans.containsKey(user)) {
                trans.put(user, 1);
            } else {
                trans.put(user, trans.get(user) + 1);
            }

            if (trans.get(user) > 1) {
                multipleLogin.add(user);
            }
        }

        System.out.println("Login count:");
        System.out.println(trans);

        System.out.println("Multiple Login users:");
        System.out.println(multipleLogin);
    }
}
