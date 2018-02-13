package com.program;
import java.util.Arrays;

public class Anagram {

	public static void main(String arg[]) {
		angramCheck("HELLO DILEEP", "OELLH PLEEDI");
	}

	public static void angramCheck(String text1, String text2) {
		char t1[] = text1.toCharArray();
		char t2[] = text2.toCharArray();
		Arrays.sort(t1);
		Arrays.sort(t2);
		if (Arrays.equals(t1, t2)) {
			System.out.println("ANGRAM");
		} else {
			System.out.println("NOT ANGRAM");
		}
	}

}
