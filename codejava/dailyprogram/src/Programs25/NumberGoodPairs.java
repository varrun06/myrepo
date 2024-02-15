//Program 44: NumberGoodPairs
package Programs25;
//1512
public class NumberGoodPairs {

	public static void main(String[] args) {
	
        int[] nums = {1, 2, 3, 1, 1, 3};

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
	System.out.println("Number of Good Pairs is "+ count );
	}
}
