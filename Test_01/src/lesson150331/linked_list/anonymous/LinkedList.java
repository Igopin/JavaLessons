package lesson150331.linked_list.anonymous;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList implements Iterable {

	private static class Node {
		Object item;
		Node next;
		
		public Node(Object item, Node next) {
		    super();
		    this.item = item;
		    this.next = next;
	    }
	}
	

	Node first, last;
	
	public void add(final Object item) {
		
		Node fresh = new Node(item, null);
		
		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}
	
	@Override
    public Iterator iterator() {
		return new Iterator() {
			private Node tmp = first;  // LinkedList.this.first;
			
			@Override
			public boolean hasNext() {
				return tmp != null;
			}

			@Override
			public Object next() {
				Object item = tmp.item;
				tmp = tmp.next;
				return item;
			}

		};
	}

}
