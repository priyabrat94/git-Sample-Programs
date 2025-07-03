package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
	static int min = 0;

	public static int[] sortBySelection(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;

			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) 
					minIndex = j;
			}
			swap(array, minIndex, i);

		}
		return array;

	}

	/*
	 * private static int minValueIndex(int[] array) { int minIndex = 0; for (int i
	 * = 0; i < array.length; i++) { if (array[0] > array[i]) { minIndex = i; } }
	 * return minIndex; }
	 * 
	 * 
	 * private static int minValue(int[] array) { int min = array[0]; for (int i =
	 * 0; i < array.length; i++) { if (min > array[i]) { min = array[i]; } } return
	 * min; }
	 */

	private static void swap(int[] array, int indx1, int indx2) {
		int temp = 0;
		temp = array[indx1];
		array[indx1] = array[indx2];
		array[indx2] = temp;
	}

	public static void main(String[] args) {
		int ab[] = { 2, 4, 1, 3, 0 };
		// { o, 4, 1, 6, 3,2, 3, 5 }
		System.out.println(Arrays.toString(ab));
		System.out.println(Arrays.toString(sortBySelection(ab)));

	}

}
