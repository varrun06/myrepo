//12
package NonUnderStandingProgram;
//counting
public class ManyNumSmallerCurrentNum1365 {

    public static void main(String[] args) {

        int nums[] = {8,1, 2, 2, 3};
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
}
