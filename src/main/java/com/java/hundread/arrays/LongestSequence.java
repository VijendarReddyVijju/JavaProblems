package com.java.hundread.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
	
	
	public static void main(String[] args) {
		
		
		int [] arr= {100, 4, 200, 1, 3, 2, 8, 6, 7, 5};
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int a:arr) {
			set.add(a);
		}
		
		int maxLength=0;
		
		for(int x=0;x<arr.length;x++) {
			
			if(!set.contains(arr[x]-1)) {
				
				int current=arr[x];
				
				int currentLength=1;
				
				while(set.contains(current+1)) {
					
					current=current+1;
					currentLength=currentLength+1;
					
					
					
				}
				
				maxLength=Math.max(maxLength, currentLength);	
				
			}
			
			
		}
		
		System.out.println(maxLength);
		
	}

}
