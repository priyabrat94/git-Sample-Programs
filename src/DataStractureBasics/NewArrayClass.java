package DataStractureBasics;

import java.util.NoSuchElementException;

public class NewArrayClass {
	private static int[] intArray;
	private int count;

	public NewArrayClass(int length) {
		intArray = new int[length];
	}

	public void print() {// print all item from array
		for (int i = 0; i < count; i++) {
			System.out.println(intArray[i]);
		}
	}

	public void insert(int value) {

		if (count == intArray.length) { // need to check if array is full or not
			int[] newIntArray = new int[count * 2]; // if full resize the array length
			for (int i = 0; i < count; i++) {
				newIntArray[i] = intArray[i];// copying previous array value to new array
			}

			intArray = newIntArray;
		}
		intArray[count] = value; // insert value
		count++;

	}

	public void remove() {

		if (count == 0) { // need to check if array is full or not
			System.out.println("Array is empty ");
			throw new NoSuchElementException("Array is Empty , No such element found in Array");
		}
		count--;
	}

	public void remove(int index) {

		if (count == 0 || index > count || index < 0) { // need to check if array is full or not
			System.out.println("Array is empty ");
			throw new NoSuchElementException("Array is Empty , No such element found in Array");
		}

		for (int i = index; i < count; i++) {
			intArray[i] = intArray[i + 1];
		}
		count--;
	}
	
	public int search(int index) {
			int  element=-1;
		if (count == 0 || index > count || index < 0) { // need to check if array is full or not
			System.out.println("Array is empty ");
			throw new NoSuchElementException("Array is Empty , No such element found in Array");
		}

		for (int i = 0; i < count; i++) {
				if(i==index) {
					element= intArray[i];
				}

		}
		return element;
	}
	
	
	public  void insertElement(int index) {
		if (count+1>=intArray.length) {
			int[] newIntArray = new int[count * 2]; // if full resize the array length
			for (int i = 0; i < count; i++) {
				newIntArray[i] = intArray[i];// copying previous array value to new array
			}

			intArray = newIntArray;
		}

	for (int i = count; i >index; i--) {
			int temp =intArray[i];
			intArray[i+1]=temp;
			

	}
	 
}

	public static void main(String[] args) {
		NewArrayClass newArray = new NewArrayClass(4);
		System.out.println("Array lenght = " + intArray.length);
		newArray.insert(10);
		newArray.insert(20);
		newArray.insert(30);
		newArray.insert(40);
		newArray.insert(50);
		newArray.insert(10);
		newArray.insert(20);
		newArray.insert(30);
		newArray.insert(40);
		newArray.insert(50);
		newArray.insert(30);
		newArray.insert(40);
		newArray.insert(50);
		newArray.print();

	}

}
