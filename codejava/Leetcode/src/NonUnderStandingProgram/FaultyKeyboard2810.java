//8
package NonUnderStandingProgram;

public class FaultyKeyboard2810 {
	
	public static String faultyKeyboard(String s) {
		
		StringBuilder typed = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (c == 'i') {
				typed.reverse(); 
			} else {
				typed.append(c); 
			}
		}

		return typed.toString();
	}

	public static void main(String[] args) {
		String example = "string";
		String result = faultyKeyboard(example);
		System.out.println(result);
	}
}
