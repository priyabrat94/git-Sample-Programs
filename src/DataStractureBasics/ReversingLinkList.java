package DataStractureBasics;

import java.util.Arrays;

public class ReversingLinkList {

	 
	
	
	public static void main(String[] args) {
		LinkedListCreation.addFirst(30);
		LinkedListCreation.addFirst(20);
		LinkedListCreation.addFirst(10);
		LinkedListCreation.addItemLast(40);
		System.out.println(Arrays.toString(LinkedListCreation.toArray()));
		LinkedListCreation.reverseLinkedList();
		System.out.println(LinkedListCreation.getKthNode(3));
	}

}
