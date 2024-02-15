//10
package LeetCode25;

public class GreatestCandies1431 {

	public static void main(String[] args) {

		int [] candies = {2,3,5,1,3};
		int extraCandies = 3;

		int max =0;

		for (int i=0;i<candies.length;i++) {

			if (max < candies[i]) {

				max = candies[i];
			}

		}

		int s1 =0;
		for (int i=0;i<candies.length;i++) {

			s1 = candies[i] + extraCandies ;


			if(s1>=max) {

				System.out.println(true);
			}
			else {
				System.out.println( false);
			}
		}
	}
}
