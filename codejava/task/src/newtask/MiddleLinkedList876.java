package newtask;

import java.util.LinkedList;

public class MiddleLinkedList876 {

	public static void main(String[] args) {

		LinkedList<Integer> obj = new LinkedList<Integer>();
	    obj.add(1);
	    obj.add(2);
	    obj.add(3);
	    obj.add(4);
	    obj.add(5);
//	    obj.add(6);
	    
	    int n = obj.size()/2;
	    System.out.println(n);
	    for (int i=0;i<n;i++) {
	    obj.pop();
	    }
	    System.out.println(obj);
	}

}
