package com.java.array.practice;

public class FindSumTwoMaxElement {
public static void main(String[] args) {
	int a[]= {20,60,10,5,4};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=a[i];
			}
		}
	}
	int sum=0;
	for (int i = 0; i < 2; i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
