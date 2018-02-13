package com.program;

import java.util.HashMap;
import java.util.Map;

public class CharcterOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, Integer> chracterMap = UniqueCharacter("HelloDileep");
		IteratetMap(chracterMap);
		
	}

	public static Map UniqueCharacter(String s) {
		int len = s.length();
		Map<Character, Integer> chracterMap = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			if (chracterMap.containsKey(s.charAt(i))) {
				chracterMap.put(s.charAt(i), chracterMap.get(s.charAt(i)) + 1);
			} else {
				chracterMap.put(s.charAt(i), new Integer(1));
			}
		}
		//System.out.println("-------" + chracterMap);
		return chracterMap;
	}

	public static void IteratetMap(Map<Character, Integer> chracterMap) {
		for (Map.Entry<Character, Integer> entry : chracterMap.entrySet()) {
//			System.out.println("Key = " + entry.getKey() + ", Value = "
//					+ entry.getValue());
			
			if(entry.getValue()==3){
				System.out.println(entry.getKey());
			}

		}

	}

}
