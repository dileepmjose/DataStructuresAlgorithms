package com.program;
public class DifferentElementInArray {

	public static void main(String arg[]) {

		int a[] = { 10, 30, 15, 17, 20, 3 };
		int b[] = { 80, 20, 3, 77, 10, 2 };
		System.out.println("----->");
		differentElements(a, b);
		differentElements(b, a);

	}

	public static void differentElements(int x[], int y[]) {

		int len_x = x.length;
		int len_y = y.length;
		boolean flag;
		for (int i = 0; i < len_x; i++) {
			flag = true;
			for (int j = 0; j < len_y; j++) {
				if (x[i] == y[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print("," + x[i]);
			}
		}

	}

}
