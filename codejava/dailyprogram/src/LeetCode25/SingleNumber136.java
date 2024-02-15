//22
package LeetCode25;

public class SingleNumber136 {

	public static void main(String[] args) {

		int nums[] = {4,1,5,1,2};
		int arr[] = new int[6];

		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}

		int total = 0;
		int result[] = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				total = i;
				result[count++] = total;
			}
		}

		for (int i = 0; i < count; i++){
			System.out.println("The single number is: " + result[i]);
		}
	}
}
