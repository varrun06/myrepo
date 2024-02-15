//Program 55: EmployeeWorkingHours
package leetprogram;

public class EmployeeWorkingHours {
    public static int EmployeesTarget(int[] hours) {
        int Count = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= 2) {
                Count++;
            }
        }

        return Count;
        
    }

    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3, 4};
        
        int result = EmployeesTarget(hours);
        System.out.println("Num target reach: " + result);
    }
}

