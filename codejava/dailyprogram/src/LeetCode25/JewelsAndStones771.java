//11
package LeetCode25;

public class JewelsAndStones771 {
	public static void main(String[] args) {

		String jewels = "aA";
		String stones = "aAAbbbb";

		char s1[]=jewels.toCharArray();
		char s2[]=stones.toCharArray();
		int count =0;
		for(int i=0;i<s1.length;i++) {

			for(int j=0;j<s2.length;j++) {

				if(s1[i]==s2[j]) {


					count++;
				}

			}


		}
		System.out.println("jewels in stone :" +count);

	}
}