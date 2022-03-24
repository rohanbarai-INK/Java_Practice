package com.java.string;

import java.util.LinkedHashSet;

public class PrintDuplicateOccuranceOnly {

	public static void main(String[] args) {
		String name="Welcome To India, Welcome To jharsuguda";
		String[] str = name.split(" ");
		LinkedHashSet<String> words=new LinkedHashSet<>();
		for (String one : str) {
			words.add(one);
		}
		for (String word : words) {
			int count=0;
			for (String  two : str) {
				if (word.equalsIgnoreCase(two)) {
					count++;
				}
			}
			if (count >1) {
				System.out.print(word+"\s");
			}
		}
	}
}
