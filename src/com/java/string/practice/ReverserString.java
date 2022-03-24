package com.java.string.practice;

public class ReverserString {
public static void main(String[] args) {
	String n="Rohan Barai";
	String rev="";
	for (int i = n.length()-1; i >=0; i--) {
		rev=rev+n.charAt(i);
	}
	System.out.println(rev);
}
}
