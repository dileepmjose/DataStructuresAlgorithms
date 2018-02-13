package com.program;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(12001);
	}

	public static void reverse(int number) {
		if (number < 1) {
			return;
		} else {
			System.out.print(number % 10);
			reverse(number / 10);
		}

	}

}
