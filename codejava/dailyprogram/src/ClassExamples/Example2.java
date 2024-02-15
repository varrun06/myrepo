package ClassExamples;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList();
		obj.add("london");
		obj.add("london");
		obj.add("delhi");
		obj.add("goa");
		obj.add("mumbai");
		obj.add("mumbai");
		obj.add("london");

		ArrayList s1 = new ArrayList();

//		Collections.sort(obj);  
		boolean check =false;

		for(int i=0;i<obj.size();i++) {

			check =false;
			for(int j=i+1;j<obj.size();j++) {

				if((obj.get(i).equals(obj.get(j)))){
					check= true;
					obj.remove(j);
				}

			}

			if(!check) {

				s1.add(obj.get(i));
			}
		}

		for(int i=0;i<s1.size();i++) {
			System.out.println(s1.get(i));
		}
	} 
}
