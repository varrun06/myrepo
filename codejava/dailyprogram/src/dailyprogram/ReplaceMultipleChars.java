//Program 22: Replace Multiple Chars
package dailyprogram;

public class ReplaceMultipleChars {
	    public static void main(String[] args) {
	        String s1 = "varrun";

	        char[] original= {
	            'c', 'h', 'e', 'n', 'a', 'i'
	        };

	        char[] changes = {
	            'a', 'm', '1', '2', '3', 'q'
	        };

	        
	        char[] s2 = s1.toCharArray();

	        
	        for (int i = 0; i < s2.length; i++) {
	            char currentChar = s2[i];

	            for (int j = 0; j < original.length; j++) {
	                if (currentChar == original[j]) {
	                    s2[i] = changes[j];
	                   
	                }
	            }
	        }

	        
	        String modifiedString = new String(s2);

	     
	        System.out.println(modifiedString);
	    }
	}

