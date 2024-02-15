//Program 46: ReverseString
package Programs25;

import java.util.Arrays;

//344
// two pointer
public class ReverseString {

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
	      
	        System.out.println(Arrays.toString(s1));
	}
}
