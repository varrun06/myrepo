package task1;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) { 
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		//cars.clear();
		//cars.size();
		
		
		System.out.println(cars.get(1));
		
		cars.remove(1);
		cars.set(0, "Opel");

		System.out.println(cars);

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}




	} 


}
