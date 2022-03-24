package com.java.string;

public class WordSeperation {
public static void main(String[] args) {
	String sentance="Welcome to the Underworld";
    String[] str=sentance.split(" ");
    for (String string : str) {
		System.out.println(string);
	}
}
}
