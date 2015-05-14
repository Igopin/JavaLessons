package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Hello");
        
        evil(Collections.checkedList(list, String.class));
    }

    private static void evil(List<String> list) {
        List list2 = list;  // bad bad bad, very bad boy
        list2.add(10);
    }
}
