package com.java.eight.programs.algorithms;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 1, 2 };
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = arr[(low + high) / 2];

			// Partition the array around the pivot.
			int i = low;
			int j = high;
			while (i <= j) {
				while (arr[i] < pivot) {
					i++;
				}

				while (arr[j] > pivot) {
					j--;
				}

				if (i <= j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}

			// Recursively sort the subarrays.
			quickSort(arr, low, j);
			quickSort(arr, i, high);
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
