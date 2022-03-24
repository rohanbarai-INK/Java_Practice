package com.java.string;

class SumOfDigit {
public static String Sum(String st) {
		int sum=0;
		int a= Integer.parseInt(st);
		System.out.println(a);//checking
		for (int i = a; i > 0; i=i/10) { //123 //12 //1
			int b=i%10;  //3 //2 //1
			sum=sum+b; //3 //5 //6
		}
		String result=sum+"";
		return result;
}



public static void main(String[] args) {
	System.out.println(Sum("123")); //result
}
}
