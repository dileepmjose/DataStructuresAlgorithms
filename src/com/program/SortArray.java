package com.program;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {45,10,30,82,15,17,82,88,23};
		sortArry(arr);
		printArry(arr);

	}
	
	/*
	 * 
	 */
	
	public static void sortArry(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if (arr[i] < arr[j]) {
					arr[i] = arr[i]+ arr[j];
					arr[j] = arr[i]- arr[j];
					arr[i] = arr[i]- arr[j];
				}
			}
		}
	}
	
	
	public static void  printArry(int arr[]) {		
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
	}

}
