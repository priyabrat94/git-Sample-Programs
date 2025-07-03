package Sorting;

import java.util.Arrays;

public class MeargeSort {

	public static void sort(int[] array) {
		// base condition
		if (array.length < 2)
			return;
		// devide the arrary from middle into2 different array
		int middle = array.length / 2;
		int left[] = new int[middle];
		for (int i = 0; i < left.length; i++) {
			left[i] = array[i];
		}
		System.out.println(Arrays.toString(left));
		int right[] = new int[array.length - middle];

		for (int i = 0; i < right.length; i++) {
			right[i] = array[i + middle];

		}
		System.out.println(Arrays.toString(right));
// sort earch part
		sort(left);
		System.out.println("left");
		sort(right);
		System.out.println("right");


		// have to merge the array

		merge(left, right, array);
		System.out.println(Arrays.toString(array));

	}

	private static void merge(int[] left, int[] right, int[] reasult) {// need to understand

		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				reasult[k++] = left[i++];

			} else {
				reasult[k] = right[j];
				j++;
				k++;

			}

		}
		while (i<left.length)
			reasult[k++] = left[i++];
		while (j<right.length)
			reasult[k++] = right[j++];


	}

	public static void main(String[] args) {
		int ab[] = { 2, 4,3,1,4,5,8,0 };
		System.out.println(Arrays.toString(ab));
		sort(ab);
	}

}
