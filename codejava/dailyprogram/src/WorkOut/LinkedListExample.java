package WorkOut;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

       
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

       
        System.out.println("Elements in the LinkedList:");
        
            System.out.println(linkedList);
            
            
            linkedList.remove("Banana");
            System.out.println(linkedList);

          
        
    }
}

