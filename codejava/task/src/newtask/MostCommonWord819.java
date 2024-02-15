package newtask;


import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class MostCommonWord819 {

	public static void main(String[] args) {

		String s1 = "Bob hit a ball, the hit BALL flew far after it was hit.";

		String s2 = s1.toLowerCase();

		String ban = "hit";

		String[] words = s2.split("[\\s.,]+");


		HashMap<String,Integer> hp = new HashMap<>();

		for(int i=0; i<words.length; i++){
			hp.put(words[i],hp.getOrDefault(words[i],0)+1);

		}

		hp.remove(ban);


		int max =Collections.max(hp.values());
		System.out.println("count: "+max);

		for(Map.Entry<String, Integer> entry: hp.entrySet()) {
			if(entry.getValue() == max) {
				System.out.println("Most Common Word: "+entry.getKey());
				break;
			}

		}      
	}

}
