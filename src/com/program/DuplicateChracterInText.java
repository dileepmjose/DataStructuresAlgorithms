package com.program;
public class DuplicateChracterInText {
	public static void main(String arg[]) {
		findDuplicate("Hello Jose");
	}

	public static void findDuplicate(String text) {
		int len = text.length();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (text.charAt(i) == text.charAt(j)) {
					System.out.println(text.charAt(i));
					break;
				}

			}

		}

	}

}
