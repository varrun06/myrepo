package NonUnderStandingProgram;

public class AbsoluteDifferenceBetweenSums {

	 public static void main(String[] args) {
	        int[] nums = {10, 4, 8, 3};
	        

        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] result = new int[n];

        // Calculate left sums
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            leftSum[i] = sum;
        }

        // Calculate right sums
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            rightSum[i] = sum;
        }

        // Calculate absolute differences
        for (int i = 0; i < n; i++) {
            result[i] = leftSum[i] - rightSum[i] ;
        }
        
        for (int i = 0; i < n; i++){
           System.out.println(result[i]); 
        }  
        
}
	 
}