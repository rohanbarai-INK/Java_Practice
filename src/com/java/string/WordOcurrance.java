package com.java.string;

import java.util.HashSet;

public class WordOcurrance {

	public static void main(String[] args) {	
		String s="This is Techies , With Techies Stuff";
		String[] str = s.split(" ");
		HashSet<String> list = new HashSet<String>();
		for (String one : str) {
			list.add(one);
		}

		for (String word : list) {
			int count=0;
			for (String string1 : str) {
				if (word.equalsIgnoreCase(string1)) {
					count++;		
				}

			}
			System.out.println(word+" "+count);
		}
	}
}

