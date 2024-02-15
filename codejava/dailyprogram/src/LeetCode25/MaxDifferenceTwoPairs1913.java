//12
package LeetCode25;

public class MaxDifferenceTwoPairs1913 {

	public static void main(String[] args) {

		int nums[] = {5,6,2,7,4};

		for (int i=0; i<nums.length-1; i++) {

			for (int j=0; j<nums.length-i-1; j++) {

				if (nums[j] > nums[j+1] ) {

					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;

				}
			}

		}

		int a= nums[0]*nums[1];
		int b= nums[nums.length-1]*nums[nums.length-2];
		int c = b-a;
		System.out.println("The product difference is "+c);

	}


}


