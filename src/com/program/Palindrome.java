package com.program;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;




public class Palindrome {

	public static void main(String[] args) {	
		System.out.println(isPalindromre("ADXA"));
		System.out.println(isPalindromre("JOOJ"));
	}
	

	public static boolean isPalindromre(String text) {
		int len = text.length();
		for (int i = 0; i < len / 2; i++) {
			if (text.charAt(i) != (text.charAt(len - i - 1))) {
				return false;
			}
		}
		return true;
	}

	public static void  printArry(int arr[]) {		
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
	}

}
