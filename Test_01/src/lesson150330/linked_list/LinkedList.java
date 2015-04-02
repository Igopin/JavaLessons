package lesson150330.linked_list;

import java.util.Iterator;

public class LinkedList implements Iterable {

	Node first;
	Node last;
	
	public void add(final Object item) {
		
		// first = new Node(item, first); BAD: must odd to the fail
		Node fresh = new Node(item, null);
		
//		if (first == null)
//		{
//			first = fresh;
//		} else {
//			Node tmp = first;
//			while (tmp.next != null) {
//				tmp = last.next;
//			}
//			tmp.next = fresh;
//		}

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}
	
	public void print() {
	    Node tmp = first;
	    while (tmp != null) {
	    	System.out.println(tmp.item);
	    	tmp = tmp.next;
	    }
    }
	
	@Override
    public Iterator iterator() {
		return new ListIterator(this);
	}

}
