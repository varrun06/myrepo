//Program 26: SingleLinkedList
package DSA;

class Node {
	String data;
	Node next;

	Node(String names) {
		data = names;
	}
}
class SingleLinkedList {
	Node head, tail;

	public void insert(String names) {


		// method 1
		//		Node new_node = new Node(names);
		//
		//		if (head == null) {
		//			head = new_node;
		//			tail = new_node;
		//		} else {
		//			tail.next = new_node;
		//			tail = new_node;
		//		}



		// method 2
		Node new_node = new Node(names); 

		if (head == null) { 
			head = new_node; 
		} 
		else { 

			Node last = head; 
			while (last.next != null) { 
				last = last.next; 
			}

			last.next = new_node; 
		} 

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void deleteNode(String key) 
	{ 

		Node temp = head, prev = null; 


		if (temp != null && temp.data == key) { 
			head = temp.next; 
			return; 
		} 
		while (temp != null && temp.data != key) { 
			prev = temp; 
			temp = temp.next; 
		} 

		if (temp == null) 
			return; 

		prev.next = temp.next; 
	} 


	public  static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.insert("john");
		list.insert("abi");
		list.insert("ram");
		list.insert("kiran");
		list.deleteNode("kiran");
		list.display();
	}

}

