package com.java.eight.programs.algorithms;

public class BubbleSort {
	public static void main(String[] args) {
		int[] data = { 5, 3, 4, 1, 2 };
		printArray(data);
		bubbleSort(data);
		printArray(data);
	}

	public static void bubbleSort(int array[]) {
		int size = array.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
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
