package com.program;

public class ReverseString {
	
	
	public static void main(String[] args) {
		reverseString("DILEEPJOSE");
	}
	
	public static void reverseString(String text){
		int len = text.length();
		for(int i=len-1;i>=0;i--){
			System.out.print(text.charAt(i));
		}
	}
	

}
