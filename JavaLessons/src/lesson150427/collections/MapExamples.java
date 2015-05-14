package lesson150427.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {
    
    public static void main(String[] args) {
        //Map<String, String> addresses = new HashMap<>();
        Map<String, String> addresses = new LinkedHashMap<>();
        addresses = new HashMap<>();
        
        addresses.put("Petrov", "Moscow");
        addresses.put("Sidorov", "St. Petersburg");
        addresses.put("Ivanov", "Saratov");
        addresses.put("Petrova", "New-York");
        addresses.put("Zhdanova", "Vladivostok");
        
        System.out.println(addresses.get("Petrova"));
        
        for (Map.Entry<String, String> addressesEntry: addresses.entrySet()) {
            System.out.println("key " + addressesEntry.getKey());
            System.out.println("value " + addressesEntry.getValue());
        }
        for (String surname : addresses.keySet()) {
            System.out.println(surname);
        }
        
        System.out.println(addresses.values());
    }

}
