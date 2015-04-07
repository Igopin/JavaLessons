package lesson150330.linked_list;

import java.util.Iterator;

public class UseList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.print();

        list.add("one");
        list.add("two");
        list.add("three");
        // list.print();

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
