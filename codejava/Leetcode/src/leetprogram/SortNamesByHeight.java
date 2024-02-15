//Program 57: SortNamesByHeight
package leetprogram;

import java.util.*;

public class SortNamesByHeight {
	public static void main(String[] args) {
		String[] names = {"Mary", "John", "Emma","varrun"};
		int[] heights = {180, 165, 170 , 171};

		HashMap<Integer, String> s1 = new HashMap<>();

		s1.put(new Integer(180),"mary");
		s1.put(new Integer(165),"john");
		s1.put(new Integer(170),"emma");
		s1.put(new Integer(171),"varrun");

		//        s1.put("180, "mary");
		//        s1.put("165", "john");
		//        s1.put("170", "emma");
		//        s1.put("170", "varrun");


		for (int i = 0; i < heights.length; i++) {     
			for (int j = i+1; j < heights.length; j++) {     
				if(heights[i] < heights[j]) {    
					int temp = heights[i];    

					heights[i] = heights[j];    
					heights[j] = temp;


					// System.out.println("Map: " + s1);


				}
			}
		}    


		System.out.println("Height: ");  




		for (int i = 0; i < heights.length; i++)

		{
			int v1 = heights[i];
			Integer intobject = new Integer(v1);

			String name = s1.get(v1);

			System.out.println("name :" + name + "," + v1);  }




		//       String ans1 = s1.get("180");
		//       String ans2 = s1.get("170");
		//       String ans3 = s1.get("165");
		//       
		//       System.out.println(ans1);  
		//       System.out.println(ans2);
		//       System.out.println(ans3);

	}
}


