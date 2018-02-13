package com.program;
import java.util.HashMap;
import java.util.Map;

public class MaxOccuringTextCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxOccuringCharcter("HELLODILEEP");
		
	}

	
	
	public static void MaxOccuringCharcter(String text) {
		int len = text.length();
		char maxCh = text.charAt(0);
		int count =0;
		for (int i = 0; i < len; i++) {
			int temcount = 0;
			for (int j = i; j < len; j++) {				
				if(text.charAt(i) == text.charAt(j)){
					temcount++;
				}
			}
			if(temcount>count){
				count = temcount;
				maxCh = text.charAt(i);
			}
		}		
		System.out.println("---------"+maxCh+"=="+count);
	}
	

	

}
