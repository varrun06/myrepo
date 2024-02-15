package WorkOut;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String name = "rajaram";
		
		StringBuilder obj = new StringBuilder();
		
		obj.append(name);
		
		System.out.println(obj.append(name));
	}

}
