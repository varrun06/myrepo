//14
package LeetCode25;

public class MaxNumStringPairs2744 {

	public static void main(String[] args) {
		String words[] = {"ab","ba","cc"};

		int count = 0; 
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1 ; j < words.length; j++) {

				StringBuilder obj = new StringBuilder(words[i]);
				obj.reverse();           

				if (words[j].equals(obj.toString())) {
					count++;
				}
			}
		}
		
		System.out.println("Number of string pairs: " + count);
	}
}
