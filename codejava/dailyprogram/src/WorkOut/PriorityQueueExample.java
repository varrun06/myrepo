package WorkOut;
//A PriorityQueue in Java is a data structure that stores 
//elements based on priority, allowing retrieval in 
//ascending order

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();

		queue.add(7);
		queue.add(5);
		queue.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(8);


		System.out.println("Priority Queue: " + queue);


	        
	       
	    }
	}

