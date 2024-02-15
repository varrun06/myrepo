//Program 58: SumOfUniqueElements
package leetprogram;

public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int[] count = new int[80]; 
      
        for (int num : nums) {
            count[num]++;
        }

        int sum = 0;

        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                sum += i;  
            }
        }

       return sum;
    }

    public static void main(String[] args) {
        int[] nums = {42,44 ,3, 3, 2};
        int result = sumOfUnique(nums);
        System.out.println("unique num: " + result);
    }
}
