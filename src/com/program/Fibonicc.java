package com.program;
public class Fibonicc {

	public static void main(String[] args) {

		fibonic(10);
		System.out.println("Fibnoiccc Recurrsion------>"
				+ fibonic_recurssion(10));
	}

	public static int fibonic_recurssion(int count) {
		if (count == 0 || count == 1) {
			return count;
		} else {
			return fibonic_recurssion(count - 1)
					+ fibonic_recurssion(count - 2);
		}
	}

	public static void fibonic(int count) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		for (int i = 0; i < count; i++) {
			fib3 = fib1 + fib2;
			System.out.print(",");
			System.out.print(fib3);
			fib1 = fib2;
			fib2 = fib3;
		}
		System.out.println("");
	}

}
