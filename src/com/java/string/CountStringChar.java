package com.java.string;

import java.util.HashSet;

public class CountStringChar {

	public static void main(String[] args) {
		
		String name= "Rohan Barai";
	
			//crate collection and add character inside it
		HashSet<Character> set=new HashSet<>();
		for (int i = 0; i < name.length(); i++) {
			set.add(name.charAt(i));
		}
		//comparing collection with each ch from string
		for (Character ch1 : set) {
			int count=0;
			for (int i = 0; i < name.length(); i++) {
				if (ch1==name.charAt(i)) {
					count ++;
				}
			}
			System.out.println(ch1+" "+count);
		}
		
	}
}


