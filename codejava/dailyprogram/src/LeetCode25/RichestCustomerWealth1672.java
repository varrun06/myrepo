//19
package LeetCode25;

public class RichestCustomerWealth1672 {

	public static void main(String[] args) {

		int s1[][] = {{1,2,3},{3,2,1}};
		int len = s1[0].length;
		int s2[] = new int[len];
		

		for (int i=0;i < s1.length;i++) {
			int sum=0;

			for (int j=0;j < s1[i].length;j++) {
				sum=sum+s1[i][j];
			}

			s2[i] = sum;	
		}

		int max =0; 

		for (int i=0;i < s2.length;i++) {

			if (max <= s2[i]) {

				max = s2[i];
			}
		}

		System.out.println("Richest Customer Wealth = " + max);
	}

}


