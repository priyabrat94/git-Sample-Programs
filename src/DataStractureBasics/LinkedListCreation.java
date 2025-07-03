package DataStractureBasics;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedListCreation {

	private static class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

	}

	public static Node first;// head
	public static Node last;// tail
	int count;
	static int size;

	public static void addItemLast(int items) {
		Node node = new Node(items);

		if (first == null)
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
		size++;

	}

	public static void addFirst(int item) {
		Node node = new Node(item);
		if (first == null)
			first = last = node;
		else {
			node.next = first;
			first = node;
		}
		size++;

	}

	public static int index(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return index;
			index++;
			current = current.next;
		}
		return -1;
	}

	public static boolean contains(int item) {
		return index(item) != -1;
	}

	public static void removeFirst() {

		if (first != null) {
			Node current = first.next;
			first.next = null;
			first = current;
		} else {
			if (first == null)
				throw new NoSuchElementException();
			if (first == last) {
				first = last = null;
				size = 0;
				return;
			}
		}
		size--;

	}

	public static void removeLast() {

		if (first == null)
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;
			size = 0;
			return;
		}

		Node current = first;
		Node previous = null;
		while (current.next != null) {

			if (current.next == last)
				break;
			previous = current.next;
		}

		last = previous;
		current.next = last;
		size--;

	}

	public static int length() {
		Node current = first;
		int length = 1;

		if (first == last)
			return 1;
		if (first == null)
			return 0;
		while (current.next != null) {
			length++;
			if (current.next == last)
				return length;

		}

		return 1;
	}

	public static int size() {
		return size;
	}

	public static int[] toArray() {
		int[] newArray = new int[size];
		Node current = first;
		int i = 0;
		while (current != null) {
			newArray[i] = current.value;
			i++;
			current = current.next;
		}
		return newArray;
	}

	public static void reverseLinkedList() {
		/*(f)[10->20-> 30->40](l)
		      p   c    n
		          p    c    n
		               p    c
		    p=f;
		    c=f.next;
		    n=c.next;
		    
		    c.next=p;
		    p.next=null;
		    l=f;
		    l.next= null;
		    f=p
		[10<-20]
		*/
		Node previous = first;
		Node current = first.next;
		
		while (current!=null) {
		Node next = current.next;		
		current.next=previous;
		previous=current;
		current=next;

	}
		last= first;
		last.next= null;
		first= previous;
System.out.println(Arrays.toString(LinkedListCreation.toArray()));
	}

	public static Node getPrevious() {
		Node current = first;
		Node previous = null;
		while (current != null) {
			if (current.next == last)
				previous = current;
			current = current.next;
		}
		return previous;
	}

	
	public static int getKthNode(int k) {
		// need to find the kth node value from start 
		Node current= first;
		Node nextCurrent= first;
		
		for(int i=0;i<k-1;i++) {
			nextCurrent= nextCurrent.next;
			
			while(nextCurrent!=last) {
				current= current.next;
				nextCurrent= nextCurrent.next;			
			}
		}
		return current.value;
		
			 
	}
	
	
	
	public static void main(String[] args) {
		LinkedListCreation list = new LinkedListCreation();
		list.addItemLast(10);
		list.addItemLast(20);
		list.addItemLast(30);
		list.addFirst(9);
		System.out.println(list.index(30));
		System.out.println(list.size());

		System.out.println(Arrays.toString(list.toArray()));
	}

}
