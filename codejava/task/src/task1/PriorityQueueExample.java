package task1;

import java.util.*;

public class PriorityQueueExample {
    
	public static void main(String[] args) {
        
        PriorityQueue<String> pq = new PriorityQueue<>();

       
        pq.add("banana");
        pq.add("apple");
        pq.add("orange");
        System.out.println("PriorityQueue after adding elements: " + pq);

        
//       pq.clear();
//       System.out.println("PriorityQueue after clear: " + pq);
   
        pq.add("grape");
        pq.add("kiwi");
        boolean containsGrape = pq.contains("grape");
        System.out.println("Contains 'grape': " + containsGrape);

       
        String peekedElement = pq.peek();
        System.out.println("Peeked element: " + peekedElement);

        
        String polledElement = pq.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("PriorityQueue after polling: " + pq);

     
        boolean removed = pq.remove("kiwi");
        System.out.println("Removed 'kiwi': " + removed);
        System.out.println("PriorityQueue after removal: " + pq);

        int size = pq.size();
        System.out.println("Size of PriorityQueue: " + size);

  
    }
}

