//Program 24: Sum Two Array
package dailyprogram;

public class SumTwoArray {
	public static void main(String[] args) {
		
		int[] s1 = {1,5,-1};
		int[] s2 = {10,12,4,5,55};
		int[] s3 = new int[5];

		int sum = 0;
		for (int i = 0; i < s2.length; i++) {

			int total;

			if ( i < s1.length) {
				if (s1[i] == -1) {
					s1[i] = 0;
				} 

				total = s1[i] + s2[i] ;
			} 

			else {
				total=s2[i];
			}


			s3[i] = total;
		}
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
	}
}
