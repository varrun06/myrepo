//18
package NonUnderStandingProgram;

public class RemoveDuplicatesArray26 {
    public static void main(String[] args) {

        int nums[] = {1, 1, 2};

        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println("Count of unique elements: " + j);

        
    }
}
