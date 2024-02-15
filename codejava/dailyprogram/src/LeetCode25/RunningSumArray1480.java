//20
package LeetCode25;

public class RunningSumArray1480 {

    public static void main(String[] args) {

        int nums[] = {3,1,2,10,1};

        int sum[] = new int[nums.length];
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
        	runningSum = runningSum + nums[i];
            sum[i] = runningSum;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(sum[i]+",");
        }
    }
}
