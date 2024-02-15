//Program 41: ContainingCharacter
package Programs25;

public class ContainingCharacter {

	public static void main(String[] args) {
		String[] words = {"abc", "bcd", "aaaa", "cbc"};
		String x = "a";

		boolean found = false;

		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(x)) {
				found = true;
				System.out.print(i + " ");
			}
		}

		if (!found) {
			System.out.println("No occurrences of '" + x + "' found.");
		}
	}
}
