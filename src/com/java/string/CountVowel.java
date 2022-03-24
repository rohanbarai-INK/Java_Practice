package com.java.string;
public class CountVowel {
public static int countVowels(String st) {
	int vc=0;
	String vs="AEIOUaeiou";
	for (int i = 0; i < st.length(); i++) {
		char a=st.charAt(i);
		if (vs.indexOf(a)>0) {
			vc++;
		}
	}
	return vc;
}
public static void main(String[] args) {
	System.out.println(CountVowel.countVowels("RohanBarai"));
	String ab="Rohan Barai";
	System.out.println(ab.replace("R", ""));
	System.out.println(ab);
}
}
