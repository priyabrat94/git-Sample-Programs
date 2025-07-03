package Sorting;

import java.util.Arrays;

public class SelectionSoreRetry {

	public static int[] selectedSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[minIndex] > array[j])
					minIndex = j;

			}
			int temp = 0;
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}

		return array;

	}

	public static void main(String[] args) {
		int ab[] = { 2, 4, 1, 3, 0 };
		// { o, 4, 1, 6, 3,2, 3, 5 }
		System.out.println(Arrays.toString(ab));
		System.out.println(Arrays.toString(selectedSort(ab)));
	}

}
