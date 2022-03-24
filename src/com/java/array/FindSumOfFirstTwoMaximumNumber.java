package com.java.array;

public class FindSumOfFirstTwoMaximumNumber {
	public static void main(String[] args) {
		int a[]= {20,30,10,15,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					System.out.println(temp);
					a[i]=a[j];
					System.out.println(i);
					a[j]=temp;
					System.out.println(j);
				}
			}
		}
		
		int sum=0;
		for(int i=0;i<2;i++)
		{
			sum=sum+a[i];
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
