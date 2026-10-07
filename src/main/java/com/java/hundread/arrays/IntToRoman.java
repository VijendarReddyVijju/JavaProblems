package com.java.hundread.arrays;

public class IntToRoman {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(intToRoman(3749));
	}
	
public static String intToRoman(int num) {

	int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String [] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    
    String roman="";
    for(int i=0;i<values.length;i++) {
    	
    	while(values[i]<num) {
    		roman=roman+romans[i];
    		
    		num=num-values[i];
    		
    		System.out.println(num);
    		
    	}
    	System.out.println(roman);
    	
    	
    }
    
    return roman;
	
	
}

}
