package WorkOut;
//A stack is a Last In, First Out (LIFO) data structure 
//with push and pop operations, commonly used for function 
//call management
//Stack: LIFO, push and pop, for functions and undo."

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<String> obj = new Stack<>();

		obj.push ("ram");
		obj.add(0,"kumar");
		obj.add(1,"rahul");
		obj.add(2,"abi");

		System.out.println(obj);
		//obj.pop();

		System.out.println(obj);
		obj.remove("rahul");
		String remove = obj.remove(1); 

		System.out.println("Removed element: "+ remove);
		System.out.println(obj);

		obj.size();
		int count = obj.size();

		System.out.println("count: "+ count);

		int position = obj.search("abi");
		System.out.println("find " + position);

	}

}
