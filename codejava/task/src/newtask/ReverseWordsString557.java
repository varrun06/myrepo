package newtask;

import java.util.Arrays;

public class ReverseWordsString557 {

	    public static void main(String[] args) {

	        String s1 = "Let's take LeetCode contest";
	        String[] s2 = s1.split("[\\s]+");
	        String[] ans = new String[s2.length];

	        for (int i = 0; i < s2.length; i++) {
	            int start = 0;
	            int end = s2[i].length() - 1;

	            char[] charArray = s2[i].toCharArray();

	            while (start < end) {
	                char temp = charArray[start];
	                charArray[start] = charArray[end];
	                charArray[end] = temp;

	                start++;
	                end--;
	            }

	            ans[i] = new String(charArray);
	        }

	        System.out.println(Arrays.toString(ans));
	    }
	}
