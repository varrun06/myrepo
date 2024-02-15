//Program 26: DoublyLinkedList 
package DSA;

public class DoublyLinkedList {

	class Node {
		String data;
		Node next;
		Node prev;

		public Node(String val, Node next, Node prev) {
			this.data = val;
			this.next = next;
			this.prev = prev;
		}
	}

	Node head = null;
	Node tail = null;

	public void addNodeFront(String val) {
		Node temp = new Node(val, head, null);

		if (head != null) {
			head.prev = temp;
		}

		head = temp;

		if (tail == null) {
			tail = temp;
		}

		System.out.println("New node added: " + val);
	}

	public void addNodeBack(String val) {
		Node temp = new Node(val, null, tail);

		if (tail != null) {
			tail.next = temp;
		}

		tail = temp;

		if (head == null) {
			head = temp;
		}

		System.out.println("New node added: " + val);
	}

	public String removeNodeFront() {
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}

		Node temp = head;
		head = head.next;

		if (head != null) {
			head.prev = null;
		} else {
			tail = null;
		}

		System.out.println("Deleted: " + temp.data);
		return temp.data;
	}

	public String removeNodeBack() {
		if (tail == null) {
			System.out.println("List is empty");
			return null;
		}

		Node temp = tail;
		tail = tail.prev;

		if (tail != null) {
			tail.next = null;
		} else {
			head = null;
		}

		System.out.println("Deleted: " + temp.data);
		return temp.data;
	}

	public void displayList() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Doubly Linked List: ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	//	public void printCount () {
	//		Node s1=head;
	//		int count =0;
	//		while (s1 != null) {
	//			count++;
	//			s1=s1.next;
	//		}
	//		
	//              System.out.println(count);
	//            }

	public void printCount () {

		Node s1=head;
		int count =0;

		for (s1=head;s1 != null; s1 = s1.next) {

			count++;
		}
		
		System.out.println(count);
	}




	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();

		list.addNodeFront("john");
		list.addNodeBack("abi");
		list.addNodeBack("ram");
		list.addNodeBack("kiran");
		list.addNodeBack("tony");

		list.displayList();
		list.printCount();
		list.removeNodeFront();
		list.removeNodeBack();

		list.displayList();
		list.printCount();

	}
}
