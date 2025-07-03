package DataStractureBasics;

public class Arrray {

	static int array[] = new int[3];
	static int count;

	public static void print() {
		for (int i = 0; i < count; i++)
			System.out.println(array[i]);
	}

	public static void addItem(int item) {
		if (count == array.length) {
			int newArray[] = new int[count * 2];
			for (int i = 0; i < count; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
		array[count] = item;
		count++;
	}

	public static void remove(int index) {
		if (index > 0 || index < count) {
			for (int i = index; i < count; i++) {
				array[i] = array[i + 1];
			}
		}
		count--;

	}

	public static int searchIndex(int item) {
		for (int i = 0; i < count; i++) {
			if (array[i] == item)
				return 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		addItem(10);
		addItem(20);
		addItem(30);
		addItem(25);
		remove(1);
		// System.out.println(array.length);
		System.out.println(searchIndex(20));
		print();

	}

}
