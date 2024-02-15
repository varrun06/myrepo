package task1;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String words = "apple,orange,banana,grape,kiwi";

        
        StringTokenizer tokenizer = new StringTokenizer(words, ",");

   
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }

	}

}
