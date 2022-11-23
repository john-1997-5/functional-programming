package com.johnson.gen182;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Map con 2 tipos parametrizados
        Map<Integer, String> workers = new HashMap<>();
        workers.put(100, "johnson");
        workers.put(101, "rosa");

        for (var entry : workers.entrySet()) {
            System.out.println("workerId: " + entry.getKey() + ", workerName: " + entry.getValue());
        }

        // clase genérica con 3 tipos parametrizados
        Gamer<String, String, Integer> gamer = new Gamer<>("johnson", "theacaro05", 0);
        System.out.println(gamer);

    }
}
