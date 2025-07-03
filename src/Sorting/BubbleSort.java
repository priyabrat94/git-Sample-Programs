package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static int[] sortByBubble(int[] array) {

		// [2,4,1,6,3]

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
//				int temp=0;
//				temp=array[j];
//				array[j]=array[j+1];
//				array[j+1]= temp;
					swap(array, j, j + 1);

				}
			}

		}
		return array;
	}

	private static void swap(int[] array, int indx1, int indx2) {
		int temp = 0;
		temp = array[indx1];
		array[indx1] = array[indx2];
		array[indx2] = temp;
	}

	public static void main(String[] args) {
		int ab[] = { 2, 4, 1, 6, 3, 3, 5 };
		System.out.println(Arrays.toString(ab));

		System.out.println(Arrays.toString(sortByBubble(ab)));
	}

}
