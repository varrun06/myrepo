package task1;

import java.io.*;
import java.util.*;

public class StackExample {


	public static void main(String[] args){


		Stack stack1 = new Stack();
		Stack<String> stack2 = new Stack<String>();


		stack1.push("4");
		stack1.push("All");
		stack1.push("Geeks");

		stack2.push("Geeks");
		stack2.push("For");
		stack2.push("Geeks");

		System.out.println("Is the stack empty? " + stack2.empty());

		System.out.println("Initial Stack: " + stack1);
		System.out.println("Does the stack contains '4'? "+ stack1.search("4"));

		System.out.println("Popped element: "+ stack1.pop());

		System.out.println("Popped element: "+ stack1.pop());
		System.out.println("Popped element: "+ stack1.push(5));
		System.out.println("The element at the top of the" + " stack is: " + stack1.peek());



		System.out.println("Stack after pop operation "+ stack1);
	}
}

