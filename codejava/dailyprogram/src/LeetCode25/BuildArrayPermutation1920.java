//1
package LeetCode25;

public class BuildArrayPermutation1920 {

	public static void main(String[] args) {

		int nums[] = {0,2,1,5,3,4};
		int[] ans = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
		
			ans[i] = nums[nums[i]];

		}

		for(int i = 0; i < nums.length; i++) {
			
			System.out.print(ans[i] + ","); 

		}
		
	}

}
