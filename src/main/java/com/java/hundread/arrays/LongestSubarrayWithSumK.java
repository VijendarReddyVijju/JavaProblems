package com.java.hundread.arrays;

public class LongestSubarrayWithSumK {
	
	
	public static void main(String[] args) {
		
		int []arr = {2, 3, 1, 2, 4, 3};
		
		int target =7;
		
		int left=0;
		int currentSum =0;
		int maxLength=0;
		int maxStart=0;
		int maxEnd=0;
		
		int right;
		for( right=0;right<arr.length;right++) {
			
			
			
			currentSum=currentSum+arr[right];
			
			while(currentSum>target&&left<=right) {
				
				currentSum=currentSum-arr[left];
				
				left++;
				
				
			}
			if(currentSum==target) {
				
				int currentLength=right-left+1;	
				
				if(maxLength<currentLength) {
					maxLength=currentLength;
					maxStart=left;
					maxEnd=right;
				}
				
			}
			
			
			
		}
		System.out.println("left"+maxStart +" right "+maxEnd);
		
		System.out.println(maxLength);
		
	}

}
