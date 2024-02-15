//Program 25: queue add,remove and count 
package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class FruitQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        
        System.out.println("Queue: " + queue);

        
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        System.out.println("count " + queue.size());
        
       
    }
}
