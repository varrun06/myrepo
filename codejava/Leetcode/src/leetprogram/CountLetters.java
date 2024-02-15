//Program 54: CountLetters
package leetprogram;

public class CountLetters {
	    public static void main(String[] args) {
	        String[] str = {"AA", "AAA", "ABA", "CCC", "DDDD", "EDED", "FFGG"};
	        char ch = 'A';

	        int count = 0;
	        for (int i = 0; i < str.length; i++) {
	            
	            String s = str[i];
	            char[] charArray = s.toCharArray();
	            
	            int Count = 0;

	            for (int j = 0; j < s.length(); j++) {
	               
	                if (charArray[j] == ch) {
	                      Count++;
	                  
	                }
	            }

	            if (Count == s.length()) {
	                
	                count++;
	               
	            }
	        }

	        System.out.println("count =" + count);
	    }
	}
