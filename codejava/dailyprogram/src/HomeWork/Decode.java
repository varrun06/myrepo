//Program 32: Decode the sentence
package HomeWork;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Decode {

	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<>();


		hashtable.put("t", "a");
		hashtable.put("h", "b");
		hashtable.put("e", "c");
		hashtable.put("q", "d");
		hashtable.put("u", "e");
		hashtable.put("i", "f");
		hashtable.put("c", "g");
		hashtable.put("k", "h");
		hashtable.put("b", "i");
		hashtable.put("r", "j");
		hashtable.put("o", "k");
		hashtable.put("w", "l");
		hashtable.put("n", "m");
		hashtable.put("f", "n");
		hashtable.put("x", "o");
		hashtable.put("j", "p");
		hashtable.put("m", "q");
		hashtable.put("p", "r");
		hashtable.put("s", "s");
		hashtable.put("v", "t");
		hashtable.put("l", "u");
		hashtable.put("a", "v");
		hashtable.put("z", "w");
		hashtable.put("y", "x");
		hashtable.put("d", "y");
		hashtable.put("g", "z");

		String encodedMessage = "vkbs bs t suepuv";
		String decodedMessage = "";



		for (char ch : encodedMessage.toCharArray()) {
			if (Character.isLetter(ch)) {
				String key = String.valueOf(ch);
				String decodedChar = hashtable.get(key);

				decodedMessage = decodedMessage + decodedChar;
			} else {

				decodedMessage = decodedMessage + ch;
			}
		}

		System.out.println("Encoded Message: " + encodedMessage);
		System.out.println("Decoded Message: " + decodedMessage);
	}
}
