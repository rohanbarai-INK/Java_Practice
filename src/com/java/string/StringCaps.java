package com.java.string;

import java.util.ArrayList;

public class StringCaps {

	public static void main(String[] args) {
		String sentance="Welcome world";
		String Replace="WELCOME WORLD";
		
        
        	for (int i = 0; i < sentance.length(); i++) {
        		char one=sentance.charAt(i);
        		System.out.println(one);
        		for (int j = 0; j < Replace.length(); j++) {
        			char two=Replace.charAt(j);
        			System.out.println(two);
        			if(one==two) {
        			sentance.replace(one, two);
        			}
        			j++;
        		}
        		i++;
        	}
        	 System.out.println(sentance);
		
       

	}

}

