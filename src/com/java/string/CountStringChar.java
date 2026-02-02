package com.java.string;

import java.util.HashSet;

public class CountStringChar {

    public static void main(String[] args) {

        String name = "Rohan Barai";

        // Convert to lowercase for case-insensitive comparison
        name = name.toLowerCase();

        // Create collection and add characters (excluding space)
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {        // ignore space
                set.add(ch);
            }
        }

        // Compare each character from set with string
        for (Character ch1 : set) {
            int count = 0;
            for (int i = 0; i < name.length(); i++) {
                if (ch1 == name.charAt(i)) {
                    count++;
                }
            }
            System.out.println(ch1 + " " + count);
        }
    }
}
