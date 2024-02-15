package task1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        
//        Map<String, Integer> obj1 = new HashMap<>();
       Map<String, Integer> obj1 = new LinkedHashMap<>();
//        Map<String, Integer> obj1 = new TreeMap<>();
        
        
        obj1.put("apple", 10);
        obj1.put("papaya", 50);
        obj1.put("orange", 20);
       

        for (String s : obj1.keySet()) {
           // System.out.println(s);
        	 System.out.println(s+" "+obj1.get(s));
        }
        
        
        
        System.out.println("after removing");
        
        obj1.remove("orange");
        
        for (String s : obj1.keySet()) {
            
         	 System.out.println(s+" "+obj1.get(s));
         }
        
       
        
        System.out.println("after update apple");
        
        obj1.put("apple", obj1.get("apple")+10);
        
        for (String s : obj1.keySet()) {
            
        	 System.out.println(s+" "+obj1.get(s));
        }
        
        
        // check product
        System.out.println(obj1.containsKey("apple"));
        System.out.println(obj1.containsKey("Dragon fruit"));
        
        
    }
}
