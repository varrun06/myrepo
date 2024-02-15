package WorkOut;

//Queue: FIFO, add rear, remove front
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		Queue <String> obj = new LinkedList <>();

		obj.add ("ram");
		obj.add("kumar");
		obj.add("rahul");
		obj.add("abi");

		System.out.println("Name list: " + obj);

		obj.remove("rahul");
		System.out.println("After remove the name " + obj);


		System.out.println("count : " + obj.size());




	}

}
