package com.binary.day7;

import java.util.*;

public class HWSet {
        public static void main(String[] args) {
            // List Example
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Apple"); // Allows duplicates
            System.out.println("List: " + fruits);

            // Set Example
            Set<String> uniqueFruits = new HashSet<>(fruits);
            System.out.println("Set: " + uniqueFruits);

            // Map Example
            Map<String, Integer> fruitPrices = new HashMap<>();
            fruitPrices.put("Apple", 100);
            fruitPrices.put("Banana", 60);
            System.out.println("Map: " + fruitPrices);
        }
}
