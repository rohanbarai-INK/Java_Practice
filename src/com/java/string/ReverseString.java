package com.java.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String n="Rohan Barai";
		String rev="";
		for (int i = n.length()-1; i >= 0; i--) {
			rev=rev+n.charAt(i);
			
		}
		System.out.println(rev);
	}

}
