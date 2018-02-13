package com.program;
public class CommonElementsInArray {

	public static void main(String arg[]) {
		int a[] = { 10, 30, 15, 17, 20, 3 };
		int b[] = { 80, 20, 3, 77, 10, 2 };
		System.out.println("----->");
		commonElements(a, b);

	}

	public static void commonElements(int x[], int y[]) {

		int len_x = x.length;
		int len_y = y.length;
		for (int i = 0; i < len_x; i++) {
			for (int j = 0; j < len_y; j++) {
				if (x[i] == y[j]) {
					System.out.println(x[i]);
				}

			}

		}

	}

}
