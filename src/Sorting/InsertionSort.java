package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static int[] sortByInsertion(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int temp = array[i];

			int j=i-1;
			while (j>=0 && array[j]>temp) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=temp;
		}

		return array;
	}

	public static void main(String[] args) {
		int ab[] = { 2, 4, 1, 3, 0 };
		System.out.println(Arrays.toString(ab));
		System.out.println(Arrays.toString(sortByInsertion(ab)));
	}

}
