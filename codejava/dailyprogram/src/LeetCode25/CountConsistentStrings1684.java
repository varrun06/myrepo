// 4
package LeetCode25;

public class CountConsistentStrings1684 {

	public static void main(String[] args) {

		String[] words = {"ad","bd","aaab","baa","badab",};
		String allowed = "ab";

		boolean found = false;
		int count=0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(allowed)) {
				found = true;
                count++;
			}
		}
		System.out.println(count);
	}
}
