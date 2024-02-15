//18
package LeetCode25;

import java.util.Arrays;

public class ReverseString344 {

	public static void main(String[] args) {
	
		 String[] s1 = {"h", "e", "l", "l", "o"};

	        
	        int start = 0;
	        int end = s1.length - 1;

	        while (start < end) {
	            
	            String temp = s1[start];
	            s1[start] = s1[end];
	            s1[end] = temp;

	            
	            start++;
	            end--;
	        }
	      
//	        for (int i=0; i<s1.length;i++ ) {
//	        	
//	        	System.out.println(s1[i]);
//	        }
	        
	        System.out.println(Arrays.toString(s1));
	}
}
