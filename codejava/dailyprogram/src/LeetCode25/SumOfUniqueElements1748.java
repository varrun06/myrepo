//23
package LeetCode25;

public class SumOfUniqueElements1748 {
	public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int[] s1 = new int[10];

        
        for (int i = 0; i < nums.length; i++) {
            s1[nums[i]]++;
        }

        int sum = 0;

        
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == 1) {
                sum = sum + i;
            }
        }

        System.out.println("Unique sum: " + sum);
    }
}
