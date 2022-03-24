package com.java.string;





public class FirstLetterUpper {
	public static String StringFormatter(String str) {
	String  words[]=str.split("\\s");
	String capitalizeWord="";
	for (String one : words) {
		String first=one.substring(0, 1);
		String AfterFirst=one.substring(1);
		capitalizeWord+=first.toUpperCase()+AfterFirst+" ";
	}
	return capitalizeWord.trim();
	}
public static void main(String[] args) {
	String a="My name is Rohan";
	System.out.println(StringFormatter("My name is rohan barai"));
}
}
