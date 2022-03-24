package com.java.string;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class RemoveDuplicate {
public static void main(String[] args) {
	
	String name= "nnaaavvveeeennn";
	 LinkedHashSet <Character> list = new LinkedHashSet<>();
	 for (int i = 0; i < name.length(); i++) {
		list.add(name.charAt(i));
	}
	for (Character ch : list) {
		System.out.print(ch);
	}
}
}
