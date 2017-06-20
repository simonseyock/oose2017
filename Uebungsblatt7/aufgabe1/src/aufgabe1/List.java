package aufgabe1;

import java.util.Iterator;

public class List<T> implements Iterable<T> {
	private class Node<U> {
		public U value;
		public Node<U> next;
		
		public Node(U v) {
			value = v;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	
	public void add(T v) {
		if (head == null) {
			head = tail = new Node<>(v);
		}
		else {
			tail.next = new Node<>(v);
			tail = tail.next;
		}
	}
	
	public void insertFirst(T v) {
		if (head == null) {
			head = tail = new Node<>(v);
		}
		else {
			Node<T> newNode = new Node<>(v);
			newNode.next = head;
			head = newNode;
		}
	}
	
	public T get(int i) {
		if (head == null) {
			throw new IndexOutOfRangeException();
		}
		
		int j = 0;
		for (T val: this) {
			if (j == i) {
				return val;
			}
		}
		
		throw new IndexOutOfRangeException();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (T it: this) {
			builder.append(it.toString() + ";");
		}
		return builder.toString();		
	}

	private class ListIterator implements Iterator<T> {
		Node<T> it;
		
		public ListIterator(Node<T> head) {
			it = head;
		}
		
		@Override
		public boolean hasNext() {
			return it != null;
		}

		@Override
		public T next() {
			T val = it.value;
			it = it.next;
			return val;
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ListIterator(head);
	}
}
