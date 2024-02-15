package ClassExamples;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {

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
//		boolean check =false;
//		
//		   int i=0;    
//		    do{ 
//		    	
//		    	int j;
//				if((obj.get(i).equals(obj.get(j)))) {}   
//		          
//		    i++;    
//		    }
//		    
//		    while(i<obj.size());   
		
		 obj.forEach((n)-> System.out.println(n)); 
		
		}   

	} 

