package task1;

	import java.util.Vector;

	public class VectorExample  {
	    public static void main(String[] args) {
	        Vector<String> obj= new Vector<>();

	 
	        obj.add("Dog");
	        obj.add("Horse");

	        obj.add(2, "Cat");
	        System.out.println("Vector: " + obj);

	        
	        Vector<String> animals = new Vector<>();
	        animals.add("Crocodile");

	        animals.addAll(obj);
	        System.out.println("New Vector: " + animals);
	    }
	}

