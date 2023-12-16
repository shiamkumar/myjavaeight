package com.java.eight.programs.algorithms;

public class InsertionSort {
	public static void main(String[] args) {
		int[] data = { 5, 3, 4, 1, 2 };
		printArray(data);
		insertionSort(data);
		printArray(data);
	}

	public static void insertionSort(int array[]) {
		int size = array.length;
		for (int i = 1; i < size; i++) {
			// store the current value at current in key
			int key = array[i];
			// pointer to index just before the key's index
			int j = i - 1;
			/*
			 * move values in arr[0...i-1] greater than key one position to their right
			 */
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			/*
			 * store the key just before the last shifted element or after the element just
			 * smaller than or equal to the key
			 */
			array[j + 1] = key;
		}
	}

	public static void printArray(int array[]) {
		int n = array.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
