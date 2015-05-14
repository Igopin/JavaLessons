package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("One");
        list.add("Two");
        list.add("Three");
        
        broadcast(Collections.unmodifiableList(list), "Hello");
    }

    private static void broadcast(List<String> list, String message) {
        for (String userName : list) {
            System.out.println(userName + " > " + message);
        }
    }
    
    private List<String> _list;
    
    //public
    //bla bla bla

}
