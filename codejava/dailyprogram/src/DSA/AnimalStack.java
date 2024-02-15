//Program 25: Stack add,remove,count and find the position 
package DSA;

import java.util.Stack;

public class AnimalStack {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();


		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");

		System.out.println("Stack: " + animals);

		String remove = animals.remove(2); 


		System.out.println("Removed element: "
				+ remove); 

		int count = animals.size();
		System.out.println("count " + count);

		int position = animals.search("Horse");
		System.out.println("find " + position);
	}
}
