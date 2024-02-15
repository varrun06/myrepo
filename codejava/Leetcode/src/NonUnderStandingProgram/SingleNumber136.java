//23
package NonUnderStandingProgram;

public class SingleNumber136 {

    public static void main(String[] args) {

        int nums[] = {4,1,2,1,2};
        int arr[] = new int[nums.length];

        for (int n : nums) {
            
            arr[n]++;
        }

      
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result = i;
                
            }
        }

        System.out.println("The single number is: " + result);
    }
}
