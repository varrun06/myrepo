package task1;

import java.util.*;

class TreesetExample { 


	public static void main(String[] args) 
	{ 

		
		// LinkedHashSet<String> h = new LinkedHashSet<String>(); 
		TreeSet h = new TreeSet();
		h.add(8); 
		h.add(5); 
		h.add(10);
		h.add(96);
		h.add(56);
		h.add(19);
		h.add(10);  
		h.add(20); 
		System.out.println(h); 
	
//		System.out.println("List contains India or not:"+ h.contains("India"));
		System.out.println("List contains 20 or not:"+ h.contains(20));

		
		h.remove(19); 
		System.out.println("List after removing 19:"+ h); 
 
		System.out.println("Iterating over list:"); 

		//Iterator<String> i = h.iterator(); 
		Iterator i = h.iterator();

		
		while (i.hasNext()) 
			System.out.println(i.next()); 
	} 
}
