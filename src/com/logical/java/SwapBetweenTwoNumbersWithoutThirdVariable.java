package com.logical.java;

import java.util.Scanner;

public class SwapBetweenTwoNumbersWithoutThirdVariable {
	  public static void main(String a[])   
	    {   
	        System.out.println("Enter the value of x and y");  
	        Scanner sc = new Scanner(System.in);  
	        /*Define variables*/  
	        int x = sc.nextInt();  
	        int y = sc.nextInt();  
	        System.out.println("before swapping numbers: "+x +" "+ y);  //x=12 y=15
	       /*Swapping*/  
	        x = x + y;       //27
	        y = x - y;       //y=12
	        x = x - y;       //x=15
	        System.out.println("After swapping: "+x +"  " + y);   //After swapping: 15  12
	    } 
}
