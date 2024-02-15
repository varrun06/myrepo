//Program 21: Merge Two Sort
package dailyprogram;

public class MergeTwoSort2 {
	public static void main(String[] args) {
		int[] s1 = {1,5,6};
		int[] s2 = {1,12,4,5,55};


		int[] s3 = new int[8];

		int num = 0;
		
		for(int i=0; i<s1.length; i++) {
			s3[num] = s1[i];
			num++;

		}

		for(int i=0; i<s2.length; i++) {

			s3[num] = s2[i];
			num++;
		}
		for(int i=0; i<s3.length; i++) {
			System.out.println(s3[i]);
		}


	}
}