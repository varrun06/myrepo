package newtask;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharString387 {

	public static void main(String[] args) {

		String s = "loveleetcode";

		char[] arr= s.toCharArray();

		for(int i=0;i<arr.length;i++) {
			boolean isUnique = true;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(i);
				break;

			}

		}
	}

}
