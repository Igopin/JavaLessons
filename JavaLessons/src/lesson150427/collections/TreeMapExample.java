package lesson150427.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
    
    public static void main(String[] args) {
        NavigableMap<String, String> calls = new TreeMap<>();
        
        calls.put("01:23","233243");
        calls.put("11:20","28003243");
        calls.put("02:00","124343");
        calls.put("13:40","2324343");
        calls.put("16:50","6723243");
        calls.put("05:00","2332343");
        
        System.out.println(calls.ceilingKey("10:00"));
        System.out.println(calls.headMap("12:00"));
        System.out.println(calls.tailMap("15:00"));
        System.out.println(calls.subMap("02:00", true, "05:00", true));
        
        for (String key : calls.keySet()) {
            System.out.println(key);
        }
    }
}
