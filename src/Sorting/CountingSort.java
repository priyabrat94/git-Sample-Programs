package Sorting;

import java.util.Arrays;

public class CountingSort {

	public static void sort(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		//System.out.println(max);

		int[] newArray = new int[max + 1];

		int count = 1;

		for (int i = 0; i < array.length; i++) {

			int index = array[i];

			if (newArray[index] == 0) {
				newArray[array[i]] = 1;
			} else {
				count = newArray[array[i]];
				newArray[array[i]] = count + 1;
			}
			// System.out.println("index =" +index);
			// System.out.println("index =" +count);
			count++;

		}
		int j = 0;

		for (int i = 0; i < newArray.length; i++) {
			int coun = newArray[i];
			while (coun != 0) {
				array[j] = i;
				j++;
				coun--;
			}

		}
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {
		int ab[] = { 2,  4, 8, 6,  9, 5,   1};
		System.out.println(Arrays.toString(ab));
		sort(ab);
	}

}
