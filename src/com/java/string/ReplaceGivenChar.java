package com.java.string;

public class ReplaceGivenChar {
public static void main(String[] args) {
	String s="My Nation is India";
	 String[] str = s.split(" ");
	 for (String word : str) {
		String words=word.replace("i", "");
		String Words=words.replace("I","");
		System.out.print(Words+" ");
	}

}
}
