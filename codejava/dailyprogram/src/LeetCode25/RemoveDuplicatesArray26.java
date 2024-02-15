//17
package LeetCode25;

public class RemoveDuplicatesArray26 {
    public static void main(String[] args) {

        int nums[] = {1,1,2};

        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
        }

        System.out.println("Count of unique elements: " + count);

        
    }
}
