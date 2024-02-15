//21
package LeetCode25;

public class ShuffleString1528 {

	public static void main(String[] args) {

		String s1 = "codeleet";
		int num[]= {4,5,6,7,0,2,1,3};

		char temp[] = new char[num.length];

		for (int i = 0; i < num.length; i++) {

			temp[num[i]] = s1.charAt(i);
			

		}

		System.out.println(temp);
	}

}
