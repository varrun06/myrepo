package WorkOut;

public class TrimExample {

	public static void main(String[] args) {

		String s = "    Hello  @   s     World     !    ";




		//		System.out.println(s.trim());
		String result = s.trim().replaceAll("s", " ");
		String result2 = result.trim().replaceAll("\\@+", "");
		System.out.println(result2);
	}

}
