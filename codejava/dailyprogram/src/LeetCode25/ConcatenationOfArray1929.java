//2
package LeetCode25;

public class ConcatenationOfArray1929 {

	public static void main(String[] args) {

		int nums[] = {1, 2, 1};
		int nums2[] = new int[nums.length];
		int ans[] = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];  

		}

		int count=0;

		for (int i = nums.length; i < ans.length; i++) {
			ans[i] = nums2[count++];  

		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}
}
