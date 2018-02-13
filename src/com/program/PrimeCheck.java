package com.program;
public class PrimeCheck {

	public static void main(String[] args) {
		printPimeNumbers(100);
	}

	public static void printPimeNumbers(int number) {
		boolean flag;
		for (int j = 1; j <= number; j++) {
			if(isPrime(j)){				
				System.out.println(j);
			}
			
		}
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
