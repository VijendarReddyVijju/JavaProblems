package com.java.hundread.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
	
	
	public static void main(String[] args) {
		int [] arr={1,2,3,3,4,6,7};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int a:arr) {
			
			if(!set.add(a))System.out.println(a);
		}
		
	}

}
