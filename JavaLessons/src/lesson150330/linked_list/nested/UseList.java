package lesson150330.linked_list.nested;

import java.util.Iterator;

public class UseList {
	public static void main(String[] args) {
	    
		LinkedList list = new LinkedList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		
		for (Object item : list) {
			System.out.println(item);
		}
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object item = it.next();
			System.out.println(item);
		}
    }
}
