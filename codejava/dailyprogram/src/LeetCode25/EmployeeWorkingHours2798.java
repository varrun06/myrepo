//7
package LeetCode25;

public class EmployeeWorkingHours2798 {
    
	public static void main(String[] args) {
        
		int[] hours = {0, 1, 2, 3, 4};
        int target =2;
		int count = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count =0;
            	count++;
            }
        }

        System.out.println("Num target reach: " + count);
    }
}


