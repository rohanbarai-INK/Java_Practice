package com.java.string.practice;

import java.util.HashSet;

public class CountStringChar {
public static void main(String[] args) {
	String name="Rohan Barai";
	HashSet<Character> set=new HashSet<Character>();
	for (int i = 0; i < name.length(); i++) {
		set.add(name.charAt(i));
	}
	
	for (Character ch : set) {
		int count =0;
		for (int j = 0; j < name.length(); j++) {
			if (ch==name.charAt(j)) {
				count ++;
			}	
		}
		System.out.println(ch+" "+count);
	}
}
}
